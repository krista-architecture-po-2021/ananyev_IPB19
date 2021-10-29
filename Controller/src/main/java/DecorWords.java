import java.util.ArrayList;
import java.util.List;

public class DecorWords extends NewsAbstrContr{
    List<String> selected_words;
    public DecorWords(List<String> filter, INews_controller c) {
        super(c);
        selected_words = filter;
    }

    @Override
    public boolean AddNews(List<NewsDO> news_list) {
        return super.AddNews(news_list);
    }

    @Override
    public boolean DeleteOne(String news_id) {
        return super.DeleteOne(news_id);
    }

    @Override
    public boolean updateNews(String old_id, String news_text, String news_id, String cathegory) {
        return super.updateNews(old_id, news_text, news_id, cathegory);
    }

    @Override
    public List<NewsBO> getAll() {
        List<NewsBO> news_list = super.getAll();
        List<NewsBO> news_list_sorted = new ArrayList<>();
        boolean isOK = false;
        for (NewsBO newsBO : news_list) {
            isOK = false;
            for (String words : selected_words)
                if (newsBO.getNews_text().contains(words)) {
                    isOK = true;
                    break;
                }
            if(isOK)
                news_list_sorted.add(newsBO);
        }
        return news_list_sorted;
    }

    @Override
    public NewsBO getOne(String news_id) {
        return super.getOne(news_id);
    }


}
