import java.util.List;

public abstract class NewsAbstrContr implements INews_controller {
    INews_controller news_controller;

    public NewsAbstrContr(INews_controller c)
    {
        news_controller = c;
    }

    public List<NewsBO> getAll() {
        return news_controller.getAll();
    }

    public NewsBO getOne(String news_id) {
        return news_controller.getOne(news_id);
    }

    public boolean AddNews(List<NewsDO> news_list) {
        return news_controller.AddNews(news_list);
    }

    public boolean DeleteOne(String news_id) {
        return news_controller.DeleteOne(news_id);
    }

    public boolean updateNews(String old_id, String news_text, String news_id, String cathegory) {
        return news_controller.updateNews(old_id, news_text, news_id, cathegory);
    }
}
