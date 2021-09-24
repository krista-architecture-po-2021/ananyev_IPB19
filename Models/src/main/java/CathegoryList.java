import java.util.ArrayList;
import java.util.List;

public class CathegoryList { // Uses Singleton
    private static volatile CathegoryList cathegoryListInst;
    private List<Cathegory> cath_list = new ArrayList<>();

    private CathegoryList(){

    }

    public static CathegoryList createCathegoryList(){
        CathegoryList local_list = cathegoryListInst;
        if(local_list == null){
            synchronized (CathegoryList.class){
                local_list = cathegoryListInst;
                if(local_list == null)
                    cathegoryListInst = local_list = new CathegoryList();
            }
        }
        return local_list;
    }

    public void addCathList(Cathegory cathegory){
        this.cath_list.add(cathegory);
    }

    public void delCathegory(String id){
        int ind_of_el = findElID(id);
        if(ind_of_el >= 0)
            cath_list.remove(ind_of_el);
    }

    private int findElID(String id){
        int ind_of_el = -1;
        for(int i = 0; i < cath_list.size(); i++)
            if(cath_list.get(i).getId().equals(id))
                ind_of_el = i;
        return ind_of_el;
    }

    public boolean updateOneEl(String old_id, String cathegory, String cathegory_id){
        int ind_of_el = findElID(old_id);
        cath_list.set(ind_of_el, new Cathegory(cathegory, cathegory_id));
        return true;
    }

    public List<Cathegory> getCath_list() {
        return cath_list;
    }

    public void setCath_list(List<Cathegory> cath_list) {
        this.cath_list = cath_list;
    }
}
