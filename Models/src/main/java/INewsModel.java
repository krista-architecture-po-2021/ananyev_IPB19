public interface INewsModel {

    INewsDAO getOne(String news_id);

    INewsDAO getAllNews();

    boolean addNews(NewsDO news);

    boolean deleteNews(String news_id);

    boolean updateNews(String old_id, NewsDO news);
}
