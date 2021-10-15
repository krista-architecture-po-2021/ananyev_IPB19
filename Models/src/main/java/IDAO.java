import java.util.List;

public interface IDAO<T> {
    List<T> getAll();
    T getOne(String id);
    boolean update(String old_id, T doo_upd);
    boolean add(T doo);
    boolean delete(String id);
}
