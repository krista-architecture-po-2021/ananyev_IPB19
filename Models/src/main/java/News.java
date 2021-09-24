public class News {
    private String news_text;
    private String id;
    private String cathegory;
    public News(String text, String id, String cathegory){
        setNews_text(text);
        setId(id);
        setCathegory(cathegory);
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

    public String getCathegory() {
        return cathegory;
    }

    public void setCathegory(String cathegory) {
        this.cathegory = cathegory;
    }
}
