public class Facade implements IFacade {
    private News_controller news_controller = new News_controller();
    private Cathegory_controller cathegory_controller = new Cathegory_controller();

    public String getAllNews() {
        return news_controller.getAll();
    }

    ;

    public String getOne(String news_id) {
        return news_controller.getOne(news_id);
    }

    @Override
    public boolean addNews(String news) { return news_controller.AddOne(news); }

    @Override
    public boolean deleteNews(String news_id) { return news_controller.DeleteOne(news_id); }

    @Override
    public String updateNews(String news_id) {
        return news_controller.updateNews(news_id);
    }

    @Override
    public String getCathegoryList() {
        return cathegory_controller.getAll();
    }

    @Override
    public boolean addCathegory(String cathegory) {
        return cathegory_controller.addOne(cathegory);
    }

    @Override
    public boolean deleteCathegory(String cathegory_id) {
        return cathegory_controller.deleteOne(cathegory_id);
    }

    @Override
    public String updateCathegory(String cathegory_id) {
        return cathegory_controller.updateOne(cathegory_id);
    }
}
