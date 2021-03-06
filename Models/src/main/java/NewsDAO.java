import java.util.ArrayList;
import java.util.List;

public class NewsDAO implements IDAO<NewsDO>{
    /*List<NewsDO> l_news = new ArrayList<>();*/
    IProvider provider;
    String entityName = "news";

    public NewsDAO(IProvider anyprovider){
        provider = anyprovider;
    }

    public List<NewsDO> getAll() {
        return provider.<NewsDO>getAll(entityName);
    }

    public NewsDO getOne(String id) {
        return provider.<NewsDO>getOne(entityName, id);
    }

    public boolean update(String old_id, NewsDO news_upd) {
        return provider.<NewsDO>update(entityName, old_id, news_upd);
    }

    public boolean add(NewsDO news) {
        return provider.<NewsDO>add(entityName, news);
    }

    public boolean delete(String id) {
        return provider.<NewsDO>delete(entityName, id);
    }


/*    public List<NewsDO> getAll() {
        return l_news;
    }

    private int searchforEl(String id) {
        int news_to_del = -1;
        NewsDO cur_news;
        for (int i = 0; i < l_news.size(); i++) {
            cur_news = l_news.get(i);
            if (cur_news.getId().equals(id))
                news_to_del = i;
        }
        return news_to_del;
    }

    public NewsDO getOne(String id) {
        int ind = searchforEl(id);
        if(ind == -1)
            return null;
        return l_news.get(ind);
    }

    public boolean update(String old_id, NewsDO news_upd) {
        int ind = searchforEl(old_id);
        if(ind == -1)
            return false;
        l_news.set(ind, news_upd);
        return true;
    }

    public boolean add(NewsDO news) {
        l_news.add(news);
        return true;
    }

    public boolean add(List<NewsDO> newsDOlist){
        l_news.addAll(newsDOlist);
        return true;
    }

    public boolean delete(String id) {
        int news_to_del = searchforEl(id);
        if (news_to_del != -1)
            l_news.remove(news_to_del);
        return true;
    }*/
}
