/*import Models.Cathegory;
import Models.CathegoryModel;*/

import java.util.List;

public class Cathegory_controller implements ICathegory_controller {
    private ModelFactory modelFactory = ModelFactory.getModel(2);
    //private ICathegoryModel cathegoryModel = new CathegoryModel();

    public List<CathegoryDO> getAll() {
        return modelFactory.getCategoriesDao().getAll();
    }

    public boolean addCaths(List<CathegoryDO> cath_list) {
        boolean retVal = true;
        for(CathegoryDO cath : cath_list) {
            if(!modelFactory.getCategoriesDao().add(cath)) {
                retVal = false;
                break;
            }
        }
        return retVal;
    }

    public boolean deleteOne(String cathegory_id) {
        return modelFactory.getCategoriesDao().delete(cathegory_id);
    }

    public boolean updateOne(String old_id, String cathegory, String cathegory_id) {
        return modelFactory.getCategoriesDao().update(old_id, new CathegoryDO(cathegory, cathegory_id));
    }
}
