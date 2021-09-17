import Models.NewsModel;

import javax.inject.Inject;

public class News_controller implements INews_controller {
    @Inject private NewsModel newsModel;

    public String getAll(){
        return new String("All News");
    }

    public String getOne(String news_id){ return new String("One News " + news_id); }

    @Override
    public boolean AddOne(String news_id) { return true; }

    @Override
    public boolean DeleteOne(String news_id) {
        return true;
    }

    @Override
    public String updateNews(String news_id) {
        return new String("updated " + news_id);
    }
}
