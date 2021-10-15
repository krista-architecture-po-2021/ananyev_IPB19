import java.util.ArrayList;
import java.util.List;

public class CathegoriesDAO implements IDAO<CathegoryDO> {
    IProvider provider;
    String entityName = "cathegories";
    private List<CathegoryDO> cath_list = new ArrayList<>();

    public CathegoriesDAO(IProvider anyprovider) {
        provider = anyprovider;
    }

    public List<CathegoryDO> getAll() {
        return provider.getAll(entityName)/*cath_list*/;
    }

    /*private int searchforEl(String id) {
        int cath_to_del = -1;
        CathegoryDO cur_cath;
        for (int i = 0; i < cath_list.size(); i++) {
            cur_cath = cath_list.get(i);
            if (cur_cath.getId().equals(id))
                cath_to_del = i;
        }
        return cath_to_del;
    }*/

    public CathegoryDO getOne(String id) {
        /*int ind = searchforEl(id);
        if(ind == -1)
            return null;
        return cath_list.get(ind);*/
        return provider.getOne(entityName, id);
    }

    public boolean update(String old_id, CathegoryDO cath_upd) {
        /*int ind = searchforEl(old_id);
        if(ind == -1)
            return false;
        cath_list.set(ind, cath_upd);
        return true;*/
        return provider.update(entityName, old_id, cath_upd);
    }

    public boolean add(CathegoryDO cath) {
        /*cath_list.add(cath);
        return true;*/
        return provider.add(entityName, cath);
    }

    /*public boolean add(List<CathegoryDO> cathDOlist){
        provider.add(entityName, c)
        *//*cath_list.addAll(cathDOlist);
        return true;*//*
    }*/

    public boolean delete(String id) {
        /*int cath_to_del = searchforEl(id);
        if (cath_to_del != -1)
            cath_list.remove(cath_to_del);
        return true;*/
        return provider.delete(entityName, id);
    }
}
