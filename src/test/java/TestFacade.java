/*import Facade.Facade;
import Facade.IFacade;*/
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestFacade {
    @Test
    void addOneNews(){
        IFacade facade = new Facade();
        assertTrue(facade.addNews("Kaka negative", "2243", "1110"));
    }

    @Test
    void getAllNews(){
        IFacade facade = new Facade();
        facade.addNews("Ilya ne na rabote negative", "22412", "1110");
        facade.addNews("Gleb na rabote positive !", "22413", "1110");
        facade.addNews("Ilya vuletel is vuza negative !", "22300", "1110");
        facade.addNews("Gleb vuletel is vuza negative !", "22301", "1110");
        facade.addNews("Za kr 5 positive !", "22415", "2243");
        facade.addNews("Ne zdal fizru negative!", "22416", "2243");
        facade.addCathegory("Politics", "1110");
        facade.addCathegory("Sports", "2243");

        List<String> sadWords = new ArrayList<>();
        sadWords.add("negative");
        List<String> selectedCathegory = new ArrayList<>();
        selectedCathegory.add("Politics");

        facade.setFilters(sadWords, selectedCathegory);

        assertNotNull(facade.getAllNews());
        List<NewsBO> news_list = facade.getAllNews();
        for(NewsBO newsBO : news_list)
            System.out.println(newsBO.getId() + ' ' + newsBO.getCathegory() + ' ' + newsBO.getNews_text());
    }

    @Test
    void getOneNews(){
        IFacade facade = new Facade();
        facade.addNews("Ilya ne v BIV negative", "22412", "1110");
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
        assertTrue(facade.updateNews("22412", "Kaka negative", "5555", "55431"));
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
        facade.addCathegory("Travelling", "24566");
        assertTrue(facade.deleteCathegory("24566"));
    }

    @Test
    void updateCathegory(){
        IFacade facade = new Facade();
        facade.addCathegory("Housekeeping", "1110");
        assertTrue(facade.updateCathegory("1110", "NotKaka", "4325"));
    }
}
