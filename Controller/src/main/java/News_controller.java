/*import Models.NewsModel;*/

import java.util.ArrayList;
import java.util.List;

public class News_controller implements INews_controller {
    private ModelFactory modelFactory = ModelFactory.getModel(2);
    //private INewsModel newsModel = new DBModel();

    public List<NewsBO> getAll() {
        List<NewsDO> doNewsList = modelFactory.getNewsDao().getAll();
        CathegoriesDAO daoCathList = (CathegoriesDAO) modelFactory.getCategoriesDao();
        List<NewsBO> boNewsList = new ArrayList<>();
        for (int i = 0; i < doNewsList.size(); i++) {
            NewsDO newsdo = doNewsList.get(i);
            boNewsList.add(new NewsBO(newsdo.getNews_text(), newsdo.getId(), daoCathList.getOne(newsdo.getCathegory_id()).getCat_text()));
        }
        return boNewsList;
    }

    public NewsBO getOne(String news_id) {
        NewsDO doNews = modelFactory.getNewsDao().getOne(news_id);
        String text = modelFactory.getCategoriesDao().getOne(doNews.getCathegory_id()).getCat_text();
        return new NewsBO(doNews.getNews_text(), doNews.getId(), text);
    }

    public boolean AddNews(List<NewsDO> news_list) {
        boolean retVal = true;
        for(NewsDO news : news_list) {
            if(!modelFactory.getNewsDao().add(news))
            {
                retVal = false;
                break;
            }
        }
        return retVal;
    }

    public boolean DeleteOne(String news_id) {
        return modelFactory.getNewsDao().delete(news_id);
    }

    public boolean updateNews(String old_id, String news_text, String news_id, String cathegory) {
        return modelFactory.getNewsDao().update(old_id, new NewsDO(news_text, news_id, cathegory));
    }
}
