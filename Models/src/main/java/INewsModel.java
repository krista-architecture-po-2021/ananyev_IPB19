public interface INewsModel {

    INewsDAO getOne(String news_id);

    INewsDAO getAllNews();

    boolean addNews(String news_text, String news_id, String cathegory);

    boolean deleteNews(String news_id);

    boolean updateNews(String old_id, String news_text, String news_id, String cathegory);
}
