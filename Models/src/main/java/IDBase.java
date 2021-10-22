import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface IDBase {
    List<NewsDO> getNews(String entityName);

    List<CathegoryDO> getCath(String entityName);

    boolean addNews(NewsDO news);

    boolean addCathegory(CathegoryDO cathegory);

    boolean deleteNews(String news_id);

    boolean deleteCath(String news_id);

    boolean updateNews(String old_id, NewsDO news);

    boolean updateCath(String old_id, CathegoryDO cath);

    NewsDO getOneNews(String id);

    CathegoryDO getOneCath(String id);
}
