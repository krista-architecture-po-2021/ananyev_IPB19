/*import Models.Cathegory;*/

import java.util.List;

public interface IFacade {
    //private News_controller news_controller = new News_controller();

    //String getAllNews(){return news_controller.getAll();};
    List<NewsBO> getAllNews();
    NewsBO getOne(String news_id);
    boolean addNews(String news_text, String news_id, String cathegory_id);
    boolean deleteNews(String news_id);
    boolean updateNews(String old_id, String news_text, String news_id, String cathegory);

    List<CathegoryDO> getCathegoryList();
    boolean addCathegory(String cathegory, String id);
    boolean deleteCathegory(String cathegory_id);
    boolean updateCathegory(String old_id, String cathegory, String cathegory_id);
}
