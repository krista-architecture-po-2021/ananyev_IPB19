/*import Models.Cathegory;*/

import java.util.List;

public interface ICathegory_controller {
    List<Cathegory> getAll();
    boolean addOne(String cathegory, String id);
    boolean deleteOne(String cathegory_id);
    boolean updateOne(String old_id, String cathegory_id, String cathegory);
}