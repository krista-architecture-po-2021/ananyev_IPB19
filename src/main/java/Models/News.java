package Models;

public class News {
    private String news_text;
    private String id;
    public void News(String text, String id){
        setNews_text(text);
        setId(id);
    }

    public String getNews_text() {
        return news_text;
    }

    public void setNews_text(String news_text) {
        this.news_text = news_text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
