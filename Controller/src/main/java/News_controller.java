/*import Models.NewsModel;*/

import javax.inject.Inject;
import java.util.List;

public class News_controller implements INews_controller {
    private NewsModel newsModel = new NewsModel();

    public List<News> getAll(){
        return newsModel.getAllNews();
    }

    public News getOne(String news_id){ return newsModel.getOne(news_id); }

    @Override
    public boolean AddOne(String news_text, String news_id, String cathegory) { return newsModel.addNews(news_text, news_id, cathegory); }

    @Override
    public boolean DeleteOne(String news_id) {
        return true;
    }

    @Override
    public boolean updateNews(String old_id, String news_text, String news_id, String cathegory) {
        return newsModel.updateNews(old_id, news_text, news_id, cathegory);
    }
}
