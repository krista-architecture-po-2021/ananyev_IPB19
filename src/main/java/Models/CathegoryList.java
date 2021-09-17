package Models;

import java.util.List;

public class CathegoryList { // Uses Singleton
    private static volatile CathegoryList cathegoryListInst;
    private List<Cathegory> cath_list;

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

    public void delCathegory(Cathegory cathegory){
        this.cath_list.
    }

    public List<Cathegory> getCath_list() {
        return cath_list;
    }

    public void setCath_list(List<Cathegory> cath_list) {
        this.cath_list = cath_list;
    }
}
