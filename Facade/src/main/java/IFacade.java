/*import Models.Cathegory;*/

import java.util.List;

public interface IFacade {
    //private News_controller news_controller = new News_controller();

    //String getAllNews(){return news_controller.getAll();};
    Message getAllNews(Message mes);
    Message setFilters(Message mes);
    Message getOne(Message mes);
    Message addNews(Message mes);
    Message deleteNews(Message mes);
    Message updateNews(Message mes);

    Message getCathegoryList(Message mes);
    Message addCathegory(Message mes);
    Message deleteCathegory(Message mes);
    Message updateCathegory(Message mes);
}
