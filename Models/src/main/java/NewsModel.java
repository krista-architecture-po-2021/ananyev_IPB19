public class NewsModel implements INewsModel {
    /*INewsDAO newsDAO = new NewsDAO();*/
    public NewsModel() {
        /*System.out.println("Created NewsModel");*/
    }

    public INewsDAO getAllNews() {
        NewsDAO newsDAO = new NewsDAO();
        newsDAO.add(new News("Kaka", "2436", "Cathegory"));
        newsDAO.add(new News("Ilya", "1111", "MOCIKT"));
        return newsDAO;
    }

    public INewsDAO getOne(String news_id) {
        NewsDAO newsDAO = new NewsDAO();
        newsDAO.add(new News("Kaka", news_id, "Cathegory"));
        return newsDAO;
    }

    public boolean addNews(String news_text, String news_id, String cathegory) {
        return true;
    }

    public boolean deleteNews(String news_id) {
        return true;
    }

    public boolean updateNews(String old_id, String news_text, String news_id, String cathegory) {
        return true;
    }

}
