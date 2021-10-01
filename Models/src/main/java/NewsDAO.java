import java.util.ArrayList;
import java.util.List;

public class NewsDAO implements INewsDAO<News>{
    List <News> l_news = new ArrayList<>();

    public List<News> getAll() {
        return l_news;
    }

    private int searchforEl(String id){
        int news_to_del = -1;
        News cur_news;
        for(int i = 0; i < l_news.size(); i++){
            cur_news = l_news.get(i);
            if(cur_news.getId().equals(id))
                news_to_del = i;
        }
        return news_to_del;
    }

    public News getOne(String id) {
        int ind = searchforEl(id);
        return l_news.get(ind);
    }

    public boolean update(String old_id, News news_upd) {
        int ind = searchforEl(old_id);
        l_news.set(ind, news_upd);
        return true;
    }

    public boolean add(News news) {
        l_news.add(news);
        return true;
    }

    public boolean delete(String id) {
        int news_to_del = -1;
        News cur_news;
        for(int i = 0; i < l_news.size(); i++){
            cur_news = l_news.get(i);
            if(cur_news.getId().equals(id))
                news_to_del = i;
        }
        if(news_to_del != -1)
            l_news.remove(news_to_del);
        return true;
    }
}