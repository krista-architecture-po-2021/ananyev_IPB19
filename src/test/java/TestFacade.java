/*import Facade.Facade;
import Facade.IFacade;*/
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestFacade {
    @Test
    void addOneNews(){
        IFacade facade = new Facade();
        assertTrue(facade.addNews("Kaka", "2243", "1110"));
    }

    @Test
    void getAllNews(){
        IFacade facade = new Facade();
        facade.addNews("Ilya ne v BIV", "22412", "1110");
        facade.addCathegory("Politics", "1110");
        facade.addCathegory("Sport", "2243");
        assertNotNull(facade.getAllNews());
    }

    @Test
    void getOneNews(){
        IFacade facade = new Facade();
        facade.addNews("Ilya ne v BIV", "22412", "1110");
        facade.addCathegory("RSATU","1110");
        assertNotNull(facade.getOne("22412"));
    }

    @Test
    void deleteOneNews(){
        IFacade facade = new Facade();
        facade.addNews("Ilya ne v BIV", "22412", "1110");
        assertTrue(facade.deleteNews("22412"));
    }

    @Test
    void updateNews(){
        IFacade facade = new Facade();
        facade.addNews("Ilya ne v BIV", "22412", "1110");
        assertTrue(facade.updateNews("22412", "Kaka", "5555", "55431"));
    }

    @Test
    void getAllCathegories(){
        IFacade facade = new Facade();
        facade.addCathegory("Nature", "55431");
        assertNotNull(facade.getCathegoryList());
        /*List<CathegoryDO>t_bo = facade.getCathegoryList();
        for (CathegoryDO cathegoryDO : t_bo) System.out.println(cathegoryDO.getCat_text() + ' ' + cathegoryDO.getId());*/
    }

    @Test
    void addOneCathegory(){
        IFacade facade = new Facade();
        assertTrue(facade.addCathegory("Fashion", "14665"));
    }

    @Test
    void deleteOneCathegory(){
        IFacade facade = new Facade();
        facade.addCathegory("Travelling", "1110");
        assertTrue(facade.deleteCathegory("1110"));
    }

    @Test
    void updateCathegory(){
        IFacade facade = new Facade();
        facade.addCathegory("Housekeeping", "1110");
        assertTrue(facade.updateCathegory("1110", "NotKaka", "4325"));
    }
}
