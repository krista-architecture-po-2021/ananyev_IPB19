import java.util.ArrayList;
import java.util.List;

public class NewsModel {
    public NewsModel(){
        System.out.println("Created NewsModel");
    }

    public List<News> getAllNews() {
        return new ArrayList<News>();
    }

    public News getOne(String news_id) {
        return new News("Kaka", news_id, "Cathegory");
    }

    public boolean addNews(String news_text, String news_id, String cathegory) { return true; }

    public boolean deleteNews(String news_id) { return true; }

    public boolean updateNews(String old_id, String news_text, String news_id, String cathegory) {
        return true;
    }

}
