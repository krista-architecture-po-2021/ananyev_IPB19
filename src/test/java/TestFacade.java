/*import Facade.Facade;
import Facade.IFacade;*/
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestFacade {
    @Test
    void getAllNews(){
        IFacade facade = new Facade();
        assertNotNull(facade.getAllNews());
    }

    @Test
    void getOneNews(){
        IFacade facade = new Facade();
        assertNotNull(facade.getOne("2243"));
    }

    @Test
    void addOneNews(){
        IFacade facade = new Facade();
        assertTrue(facade.addNews("Kaka", "2243", "Cathegory"));
    }

    @Test
    void deleteOneNews(){
        IFacade facade = new Facade();
        assertTrue(facade.deleteNews("2243"));
    }

    @Test
    void updateNews(){
        IFacade facade = new Facade();
        assertTrue(facade.updateNews("2243", "Kaka", "5555", "Cathegory"));
    }

    @Test
    void getAllCathegories(){
        IFacade facade = new Facade();
        assertNotNull(facade.getCathegoryList());
    }

    @Test
    void addOneCathegory(){
        IFacade facade = new Facade();
        assertTrue(facade.addCathegory("Kaka", "2243"));
    }

    @Test
    void deleteOneCathegory(){
        IFacade facade = new Facade();
        assertTrue(facade.deleteCathegory("2243"));
    }

    @Test
    void updateCathegory(){
        IFacade facade = new Facade();
        assertTrue(facade.updateCathegory("2243", "Kaka2", "5555"));
    }
}
