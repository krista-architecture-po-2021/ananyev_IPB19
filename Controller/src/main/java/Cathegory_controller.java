/*import Models.Cathegory;
import Models.CathegoryModel;*/

import java.util.List;

public class Cathegory_controller implements ICathegory_controller {
    private ICathegoryModel cathegoryModel = new CathegoryModel();

    @Override
    public List<Cathegory> getAll() {
        return cathegoryModel.getAll();
    }

    @Override
    public boolean addOne(String cathegory, String id) {
        return cathegoryModel.add(cathegory, id);
    }

    @Override
    public boolean deleteOne(String cathegory_id) {
        return cathegoryModel.deleteOne(cathegory_id);
    }

    @Override
    public boolean updateOne(String old_id, String cathegory, String cathegory_id) {
        return cathegoryModel.updateOne(old_id, cathegory, cathegory_id);
    }
}
