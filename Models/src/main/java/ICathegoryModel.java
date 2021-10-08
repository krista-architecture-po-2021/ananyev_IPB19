import java.util.List;

public interface ICathegoryModel {

    boolean add(String cathegory, String id);

    List<CathegoryDO> getAll();

    boolean deleteOne(String cathegory_id);

    public boolean updateOne(String old_id, String cathegory, String cathegory_id);
}
