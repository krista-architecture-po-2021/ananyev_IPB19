/*import Models.NewsModel;*/

import java.util.List;

public class News_controller implements INews_controller {
    private INewsModel newsModel = new NewsModel();

    public List<News> getAll() {
        return newsModel.getAllNews().getAll();
    }

    public News getOne(String news_id) {
        return (News) newsModel.getOne(news_id).getOne(news_id);
    }

    public boolean AddOne(String news_text, String news_id, String cathegory) {
        return newsModel.addNews(news_text, news_id, cathegory);
    }

    public boolean DeleteOne(String news_id) { return newsModel.deleteNews(news_id); }
    
    public boolean updateNews(String old_id, String news_text, String news_id, String cathegory) {
        return newsModel.updateNews(old_id, news_text, news_id, cathegory);
    }
}
