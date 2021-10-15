import java.util.List;

public interface IProvider {
    public <T> boolean update(String entityName, String old_id, T doo);
    public <T> List<T> getAll(String entityName);
    public <T> T getOne(String entityName, String id);
    public <T> boolean delete(String entityName, String id);
    public <T> boolean add(String entityName, T doo);
}
