import java.util.List;

public interface INewsModel {

    NewsDO getOne(String news_id);

    List<NewsDO> getAllNews();

    boolean addNews(NewsDO news);

    boolean deleteNews(String news_id);

    boolean updateNews(String old_id, NewsDO news);
}
