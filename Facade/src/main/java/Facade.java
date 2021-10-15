/*import Controller.Cathegory_controller;
import Controller.News_controller;
import Models.Cathegory;*/

import java.util.List;

public class Facade implements IFacade {
    private News_controller news_controller = new News_controller();
    private Cathegory_controller cathegory_controller = new Cathegory_controller();

    public List<NewsBO> getAllNews() {
        return news_controller.getAll();
    }

    public NewsBO getOne(String news_id) {
        return news_controller.getOne(news_id);
    }

    public boolean addNews(String news_text, String news_id, String cathegory_id) { return news_controller.AddOne(news_text, news_id, cathegory_id); }

    public boolean deleteNews(String news_id) { return news_controller.DeleteOne(news_id); }

    public boolean updateNews(String old_id, String news_text, String news_id, String cathegory) {
        return news_controller.updateNews(old_id, news_text, news_id, cathegory);
    }

    public List<CathegoryDO> getCathegoryList() {
        return cathegory_controller.getAll();
    }

    public boolean addCathegory(String cathegory, String id) {
        return cathegory_controller.addOne(cathegory, id);
    }

    public boolean deleteCathegory(String cathegory_id) {
        return cathegory_controller.deleteOne(cathegory_id);
    }

    public boolean updateCathegory(String old_id, String cathegory, String cathegory_id) {
        return cathegory_controller.updateOne(old_id, cathegory, cathegory_id);
    }
}
