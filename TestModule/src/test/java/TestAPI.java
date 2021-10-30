import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class TestAPI {
    IFacade facade = new Facade();
    @Test
    void testAPIAdmin(){
        APIAdmin apiAdmin = new APIAdmin(facade);

        Message message = new Message();

        // Добавление категорий
        List<CathegoryDO> cath_list = new ArrayList<>();
        cath_list.add(new CathegoryDO("AnimalWorld", "2222"));
        cath_list.add(new CathegoryDO("Politics", "1111"));
        cath_list.add(new CathegoryDO("Sport", "3333"));
        cath_list.add(new CathegoryDO("Fashion", "4444"));
        cath_list.add(new CathegoryDO("Business", "9999"));
        cath_list.add(new CathegoryDO("WorldRecords", "7777"));
        message.setCath_list(cath_list);

        message = apiAdmin.addCathegory(message);
        assertNotEquals(400, message.getResponse_code());

        // Добавление новостей
        List<NewsBO> news_list = new ArrayList<>();
        news_list.add(new NewsBO("Ilya ne zdal laby negative", "5889", "Politics"));
        news_list.add(new NewsBO("Student zdal normativ po fizre", "5149", "Sport"));
        news_list.add(new NewsBO("Shamil prishel na pary", "1799", "Fashion"));
        news_list.add(new NewsBO("Prishla positive Stipendia", "9877", "Business"));
        news_list.add(new NewsBO("Ilya zdal zachet", "2541", "Politics"));
        news_list.add(new NewsBO("Zakruta sessia na 5", "7666", "WorldRecords"));
        message.setNews_list(news_list);
        message = apiAdmin.addNews(message);
        assertNotEquals(400, message.getResponse_code());

        //  Получение одной новости
        news_list.clear();
        news_list.add(new NewsBO("", "1799",""));
        message.setNews_list(news_list);
        message = apiAdmin.getOne(message);
        assertNotEquals(400, message.getResponse_code());

        // Получение списка новостей
        message = apiAdmin.getAllNews(message);
        assertNotEquals(400, message.getResponse_code());

        // Получение спика категорий
        message = apiAdmin.getCathegoryList(message);
        assertNotEquals(400, message.getResponse_code());

        // Обновление новости
        news_list.clear();
        news_list.add(new NewsBO("Shamil opozdal","1799", "Politics"));
        message.setNews_list(news_list);
        message.setOld_news(new NewsBO("","1799",""));
        message = apiAdmin.updateNews(message);
        assertNotEquals(400, message.getResponse_code());

        // удаление новости
        news_list.clear();
        news_list.add(new NewsBO("", "1799", ""));
        message.setNews_list(news_list);
        message = apiAdmin.deleteNews(message);
        assertNotEquals(400, message.getResponse_code());

        // Обновление категории
        cath_list.clear();
        cath_list.add(new CathegoryDO("In the World of Animals", "2222"));
        message.setCath_list(cath_list);
        message.setOld_cath(new CathegoryDO("AnimalWorld",""));
        message = apiAdmin.updateCathegory(message);
        assertNotEquals(400, message.getResponse_code());

        // Удаление категории
        cath_list.clear();
        cath_list.add(new CathegoryDO("Fashion",""));
        message.setCath_list(cath_list);
        message = apiAdmin.deleteCathegory(message);

        // Установка фильтров
        List <String> sad_words = new ArrayList<>();
        sad_words.add("positive");
        sad_words.add("zdal");
        message.setSadwords(sad_words);
        message = apiAdmin.setfilters(message);
        assertNotEquals(400, message.getResponse_code());
        message = apiAdmin.getAllNews(message);
        assertNotEquals(400, message.getResponse_code());

        // Сброс фильтров
        message = apiAdmin.clearFilters(message);
        assertNotEquals(400, message.getResponse_code());
        message = apiAdmin.getAllNews(message);
        assertNotEquals(400, message.getResponse_code());
    }

    @Test
    void testAPIAuthor() {
        APIAuthor apiAuthor = new APIAuthor(facade);

        Message message = new Message();

        // Добавление новостей
        List<NewsBO> news_list = new ArrayList<>();
        news_list.add(new NewsBO("Napisal project positive", "9089", "WorldRecords"));
        news_list.add(new NewsBO("Kafedra na pyatom etazhe", "0032", "Sport"));
        news_list.add(new NewsBO("Pary otmenili", "2542", "Politics"));
        message.setNews_list(news_list);
        message = apiAuthor.addNews(message);
        assertNotEquals(400, message.getResponse_code());

        //  Получение одной новости
        news_list.clear();
        news_list.add(new NewsBO("", "2542",""));
        message.setNews_list(news_list);
        message = apiAuthor.getOne(message);
        assertNotEquals(400, message.getResponse_code());

        // Получение списка новостей
        message = apiAuthor.getAllNews(message);
        assertNotEquals(400, message.getResponse_code());

        // Получение спика категорий
        message = apiAuthor.getCathegoryList(message);
        assertNotEquals(400, message.getResponse_code());

        // Обновление новости
        news_list.clear();
        news_list.add(new NewsBO("Otmenili otmeny par","2542", "Sport"));
        message.setNews_list(news_list);
        message.setOld_news(new NewsBO("","2542",""));
        message = apiAuthor.updateNews(message);
        assertNotEquals(400, message.getResponse_code());

        // удаление новости
        news_list.clear();
        news_list.add(new NewsBO("", "2542", ""));
        message.setNews_list(news_list);
        message = apiAuthor.deleteNews(message);
        assertNotEquals(400, message.getResponse_code());
    }

    @Test
    void testAPIClient(){
        APIClient apiClient = new APIClient(facade);

        Message message = new Message();
        List<NewsBO> news_list = new ArrayList<>();

        //  Получение одной новости
        news_list.add(new NewsBO("", "0032",""));
        message.setNews_list(news_list);
        message = apiClient.getOne(message);
        assertNotEquals(400, message.getResponse_code());

        // Получение списка новостей
        message = apiClient.getAllNews(message);
        assertNotEquals(400, message.getResponse_code());

        // Получение спика категорий
        message = apiClient.getCathegoryList(message);
        assertNotEquals(400, message.getResponse_code());
    }
}
