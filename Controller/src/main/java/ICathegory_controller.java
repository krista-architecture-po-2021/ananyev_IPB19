/*import Models.Cathegory;*/

import java.util.List;

public interface ICathegory_controller {
    List<CathegoryDO> getAll();
    boolean addCaths(List<CathegoryDO> cath_list);
    boolean deleteOne(String cathegory_id);
    boolean updateOne(String old_id, String cathegory, String cathegory_id);
}
