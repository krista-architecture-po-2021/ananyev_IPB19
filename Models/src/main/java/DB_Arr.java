import java.util.ArrayList;
import java.util.List;

public class DB_Arr implements IDBase{
    private List<NewsDO> news_list = new ArrayList<>();
    private List<CathegoryDO> cath_list = new ArrayList<>();

    public List<NewsDO> getNews(String entityName){
        /*NewsDAO newsDAO = new NewsDAO();
        newsDAO.add(news_list);*/
        return news_list;
    }

    public List<CathegoryDO> getCath(String entityName){
        /*CathegoriesDAO cathDAO = new CathegoriesDAO();
        cathDAO.add(cath_list);*/
        return cath_list;
    }

    public boolean addNews(NewsDO news){
        news_list.add(news);
        return true;
    }

    public boolean addCathegory(CathegoryDO cathegory){
        cath_list.add(cathegory);
        return true;
    }

    public boolean deleteNews(String news_id){
        int element_ind = searchforNews(news_id);
        if(element_ind == -1)
            return false;
        news_list.remove(element_ind);
        return true;
    }

    public boolean deleteCath(String news_id){
        int element_ind = searchforCath(news_id);
        if(element_ind == -1)
            return false;
        cath_list.remove(element_ind);
        return true;
    }

    public boolean updateNews(String old_id, NewsDO news){
        int element_id = searchforNews(old_id);
        if(element_id == -1)
            return false;
        news_list.set(element_id, news);
        return true;
    }

    public boolean updateCath(String old_id, CathegoryDO cath){
        int element_id = searchforCath(old_id);
        if(element_id == -1)
            return false;
        cath_list.set(element_id, cath);
        return true;
    }

    public NewsDO getOneNews(String id){
        int ind = searchforNews(id);
        if(ind < 0)
            return null;
        return news_list.get(ind);
    }

    public CathegoryDO getOneCath(String id){
        int ind = searchforCath(id);
        if(ind < 0)
            return null;
        return cath_list.get(ind);
    }

    private int searchforCath(String id) {
        int el_to_find = -1;
        for (int i = 0; i < cath_list.size(); i++) {
            if (cath_list.get(i).getId().equals(id))
                el_to_find = i;
        }
        return el_to_find;
    }

    private int searchforNews(String id) {
        int el_to_find = -1;
        for (int i = 0; i < news_list.size(); i++) {
            if (news_list.get(i).getId().equals(id))
                el_to_find = i;
        }
        return el_to_find;
    }
}
