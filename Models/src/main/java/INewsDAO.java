import java.util.List;

public interface INewsDAO<T> {
    List<T> getAll();
    T getOne(String id);
    boolean update(String old_id, News news_upd);
    boolean add(News news);
    boolean delete(String id);
}
