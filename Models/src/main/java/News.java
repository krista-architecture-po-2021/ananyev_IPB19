public class News {
    private String news_text;
    private String id;
    private String cathegory_id;

    public News(String text, String id, String cathegory_id) {
        setNews_text(text);
        setId(id);
        setCathegory_id(cathegory_id);
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

    public String getCathegory_id() {
        return cathegory_id;
    }

    public void setCathegory_id(String cathegory_id) {
        this.cathegory_id = cathegory_id;
    }
}
