import java.util.List;

public interface INewsDAO<T> {
    List<T> getAll();
    T getOne(String id);
    boolean update(String old_id, NewsDO news_upd);
    boolean add(NewsDO news);
    boolean delete(String id);
}
