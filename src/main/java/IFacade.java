public interface IFacade {
    //private News_controller news_controller = new News_controller();

    //String getAllNews(){return news_controller.getAll();};
    String getAllNews();
    String getOne(String news_id);
    boolean addNews(String news);
    boolean deleteNews(String news_id);
    String updateNews(String news_id);

    String getCathegoryList();
    boolean addCathegory(String cathegory);
    boolean deleteCathegory(String cathegory_id);
    String updateCathegory(String cathegory_id);
}
