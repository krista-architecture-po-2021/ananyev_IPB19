package Models;

public class CathegoryModel {
    private CathegoryModel(){
        System.out.println("Created CathegoryModel");
    }

    public boolean add(String cathegory) {
        System.out.println(cathegory);
        return true;
    }
}
