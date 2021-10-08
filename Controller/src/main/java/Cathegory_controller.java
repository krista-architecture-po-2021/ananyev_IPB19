/*import Models.Cathegory;
import Models.CathegoryModel;*/

import java.util.List;

public class Cathegory_controller implements ICathegory_controller {
    private ModelFactory modelFactory = ModelFactory.getModel(2);
    //private ICathegoryModel cathegoryModel = new CathegoryModel();

    public List<CathegoryDO> getAll() {
        return modelFactory.getNewsDao().getAll();
    }

    public boolean addOne(String cathegory, String id) {
        return modelFactory.addCathegory(new CathegoryDO(cathegory, id));
    }

    public boolean deleteOne(String cathegory_id) {
        return modelFactory.deleteCath(cathegory_id);
    }

    public boolean updateOne(String old_id, String cathegory, String cathegory_id) {
        return modelFactory.updateCath(old_id, new CathegoryDO(cathegory, cathegory_id));
    }
}
