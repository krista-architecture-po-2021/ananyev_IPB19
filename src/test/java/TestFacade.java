import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestFacade {
    @Test
    void getAllNews(){
        IFacade facade = new Facade();
        assertEquals("All News", facade.getAllNews());
    }

    @Test
    void getOneNews(){
        IFacade facade = new Facade();
        assertEquals("One News 2243", facade.getOne("2243"));
    }

    @Test
    void addOneNews(){
        IFacade facade = new Facade();
        assertTrue(facade.addNews("2243"));
    }

    @Test
    void deleteOneNews(){
        IFacade facade = new Facade();
        assertTrue(facade.deleteNews("2243"));
    }

    @Test
    void updateNews(){
        IFacade facade = new Facade();
        assertEquals("updated 2243",facade.updateNews("2243"));
    }

    @Test
    void getAllCathegories(){
        IFacade facade = new Facade();
        assertEquals("All Cathegories", facade.getCathegoryList());
    }

    @Test
    void addOneCathegory(){
        IFacade facade = new Facade();
        assertTrue(facade.addCathegory("Kaka"));
    }

    @Test
    void getOneCathegory(){
        IFacade facade = new Facade();
        assertTrue(facade.addCathegory("2243"));
    }

    @Test
    void deleteOneCathegory(){
        IFacade facade = new Facade();
        assertTrue(facade.deleteCathegory("2243"));
    }

    @Test
    void updateCathegory(){
        IFacade facade = new Facade();
        assertEquals("updated 2243",facade.updateCathegory("2243"));
    }
}
