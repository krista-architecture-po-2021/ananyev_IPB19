import Models.CathegoryModel;

import javax.inject.Inject;

public class Cathegory_controller implements ICathegory {
    @Inject
    private CathegoryModel cathegoryModel;

    @Override
    public String getAll() {
        return new String("All Cathegories");
    }

    @Override
    public boolean addOne(String cathegory) {
        return cathegoryModel.add(cathegory);
    }

    @Override
    public boolean deleteOne(String cathegory_id) {
        return true;
    }

    @Override
    public String updateOne(String cathegory_id) {
        return new String("updated " + cathegory_id);
    }
}
