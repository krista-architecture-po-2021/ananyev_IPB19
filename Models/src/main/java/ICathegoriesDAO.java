import java.util.List;

public interface ICathegoriesDAO<T> {
    List<T> getAll();
    T getOne(String id);
    boolean update(String old_id, CathegoryDO news_upd);
    boolean add(CathegoryDO cath);
    boolean delete(String id);
}
