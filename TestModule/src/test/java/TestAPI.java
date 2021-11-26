import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class TestAPI {
    @Test
    void testAPIAdmin(){
        Facade facade = new Facade();
        APIAdmin apiAdmin = new APIAdmin(facade);

        Message message = new Message();


        // Добавление категорий
        List<CathegoryDO> cath_list = new ArrayList<>();
        cath_list.add(new CathegoryDO("AnimalWorld", "2222"));
        cath_list.add(new CathegoryDO("Politics", "1111"));
        cath_list.add(new CathegoryDO("Sport", "3333"));
        cath_list.add(new CathegoryDO("Fashion", "4444"));
        message.setCath_list(cath_list);

        int code = apiAdmin.addCathegory(message).getResponse_code();
        /*System.out.println(code);*/
        assertNotEquals(400, code);

        // Добавление новостей
        List<NewsBO> news_list = new ArrayList<>();
        news_list.add(new NewsBO("Ilya ne zdal laby", "5889", "Politics"));
        news_list.add(new NewsBO("Student zdal normativ po fizre", "5149", "Sport"));
        news_list.add(new NewsBO("Shamil prishel na pary", "1799", "AnimalWorld"));
        message.setNews_list(news_list);
        code = apiAdmin.addNews(message).getResponse_code();
        /*System.out.println(code);*/
        assertNotEquals(400, code);

        //  Получение одной новости
        news_list.clear();
        news_list.add(new NewsBO("", "1799",""));
        message.setNews_list(news_list);
        message = apiAdmin.getOne(message);
        /*System.out.println(message.getResponse_code());*/
        assertNotEquals(400, message.getResponse_code());
        /*System.out.println(message.getNews_list().get(0).getNews_text() + ' ' +  message.getNews_list().get(0).getId()
        + ' ' + message.getNews_list().get(0).getCathegory());*/

        // Получение списка новостей
        message = apiAdmin.getAllNews(message);
        assertNotEquals(400, message.getResponse_code());
        /*System.out.println(message.getResponse_code());*/

        // Получение спика категорий
        message = apiAdmin.getCathegoryList(message);
        assertNotEquals(400, message.getResponse_code());

        // удаление новости
        news_list.clear();
        news_list.add(new NewsBO("", "1799", ""));
        message.setNews_list(news_list);
        message = apiAdmin.deleteNews(message);
        assertNotEquals(400, message.getResponse_code());

        // Удаление категории
        cath_list.clear();
        cath_list.add(new CathegoryDO("AnimalWorld",""));
        message.setCath_list(cath_list);
        message = apiAdmin.deleteCathegory(message);

        // Обновление категории
        message.setOld_cath(new CathegoryDO("Politics",""));
    }
}
