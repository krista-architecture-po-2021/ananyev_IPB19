import java.util.List;

public class CathegoryModel {
    private CathegoryList cath_list;
    public CathegoryModel(){
        /*System.out.println("Created CathegoryModel");*/
        cath_list = CathegoryList.createCathegoryList();
    }

    public boolean add(String cathegory, String id) {
        cath_list.addCathList(new Cathegory(cathegory, id));
//        System.out.println(cathegory);
        return true;
    }

    public List<Cathegory> getAll(){
        return cath_list.getCath_list();
    }
    public boolean deleteOne(String cathegory_id){
        cath_list.delCathegory(cathegory_id);
        return true;
    }
    public boolean updateOne(String old_id, String cathegory, String cathegory_id){

        return true;
    }
}
