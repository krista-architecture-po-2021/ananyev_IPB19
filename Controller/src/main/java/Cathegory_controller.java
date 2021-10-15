/*import Models.Cathegory;
import Models.CathegoryModel;*/

import java.util.List;

public class Cathegory_controller implements ICathegory_controller {
    private ModelFactory modelFactory = ModelFactory.getModel(1);
    //private ICathegoryModel cathegoryModel = new CathegoryModel();

    public List<CathegoryDO> getAll() {
        return modelFactory.getCategoriesDao().getAll();
    }

    public boolean addOne(String cathegory, String id) {
        return modelFactory.getCategoriesDao().add(new CathegoryDO(cathegory, id));
    }

    public boolean deleteOne(String cathegory_id) {
        return modelFactory.getCategoriesDao().delete(cathegory_id);
    }

    public boolean updateOne(String old_id, String cathegory, String cathegory_id) {
        return modelFactory.getCategoriesDao().update(old_id, new CathegoryDO(cathegory, cathegory_id));
    }
}
