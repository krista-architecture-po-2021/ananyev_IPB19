import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(){
        Facade facade = new Facade();
        APIAdmin apiAdmin = new APIAdmin(facade);

        Message message = new Message();

        List<CathegoryDO> cath_list = new ArrayList<>();
        cath_list.add(new CathegoryDO("AnimalWorld", "2222"));
        cath_list.add(new CathegoryDO("Politics", "1111"));
        cath_list.add(new CathegoryDO("Sport", "3333"));
        cath_list.add(new CathegoryDO("Fashion", "4444"));
        message.setCath_list(cath_list);

        System.out.println(apiAdmin.addCathegory(message).getResponse_code());
    }
}
