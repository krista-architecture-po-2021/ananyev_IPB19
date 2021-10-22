/*import Controller.Cathegory_controller;
import Controller.News_controller;
import Models.Cathegory;*/

import java.util.List;

public class Facade implements IFacade {
    private final INews_controller news_controller = new News_controller();
    //private final INews_controller news_controller = new DecorPositive(new News_controller());
    private final ICathegory_controller cathegory_controller = new Cathegory_controller();


    private INews_controller getNewsContoroller(List<String> sadWords, List<String> selectedCathegory)
    {
        INews_controller c = new News_controller();
        if((sadWords != null)&&(sadWords.size() > 0))
            c = new DecorWords(sadWords, c);
        if((selectedCathegory != null)&&(selectedCathegory.size() > 0))
            c = new DecorCathegory(selectedCathegory, c);
        return c;
    }

    public List<NewsBO> getAllNews(List<String> sadWords, List<String> selectedCathegory) {
        return getNewsContoroller(sadWords, selectedCathegory).getAll();
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
