import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface IDBase {
    public List<NewsDO> getNews(String entityName);

    public List<CathegoryDO> getCath(String entityName);

    public boolean addNews(NewsDO news);

    public boolean addCathegory(CathegoryDO cathegory);

    public boolean deleteNews(String news_id);

    public boolean deleteCath(String news_id);

    public boolean updateNews(String old_id, NewsDO news);

    public boolean updateCath(String old_id, CathegoryDO cath);

    public NewsDO getOneNews(String id);

    public CathegoryDO getOneCath(String id);
}
