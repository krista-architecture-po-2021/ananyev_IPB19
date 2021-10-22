import java.util.ArrayList;
import java.util.List;

public class DecorCathegory extends NewsAbstrContr{
    List<String> selectedCathegory;

    public DecorCathegory(List<String> cathegory, INews_controller c) {
        super(c);
        selectedCathegory = cathegory;
    }

    @Override
    public boolean AddOne(String news_text, String news_id, String cathegory) {
        return super.AddOne(news_text, news_id, cathegory);
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
            for (String words : selectedCathegory)
                if (newsBO.getCathegory().equals(words)) {
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
