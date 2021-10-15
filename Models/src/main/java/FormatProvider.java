import java.util.List;

public class FormatProvider implements IProvider{
    IDBase db;
    public FormatProvider(IDBase anydb){
        db = anydb;
    }

    public <T> boolean update(String entityName, String old_id, T doo) {
        if(entityName.equals("news"))
            return db.updateNews(old_id, (NewsDO) doo);
        if(entityName.equals("cathegories"))
            return db.updateCath(old_id, (CathegoryDO) doo);
        return false;
    }

    public <T> List<T> getAll(String entityName) {
        if(entityName.equals("news"))
            return (List<T>) db.getNews(entityName);
        if(entityName.equals("cathegories"))
            return (List<T>) db.getCath(entityName);
        return null;
    }

    public <T> T getOne(String entityName, String id) {
        if(entityName.equals("news"))
            return (T) db.getOneNews(id);
        if(entityName.equals("cathegories"))
            return (T) db.getOneCath(id);
        return null;
    }

    public <T> boolean delete(String entityName, String id) {
        if(entityName.equals("news"))
            return db.deleteNews(id);
        if(entityName.equals("cathegories"))
            return db.deleteCath(id);
        return false;
    }

    public <T> boolean add(String entityName, T doo) {
        if(entityName.equals("news"))
            return db.addNews((NewsDO) doo);
        if(entityName.equals("cathegories"))
            return db.addCathegory((CathegoryDO) doo);
        return false;
    }
}
