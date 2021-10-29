import java.util.List;

public class Message {
    private List<NewsBO> news_list;
    private List<CathegoryDO> cath_list;
    private List<String> sadwords;
    private List<String> selected_cathegory;
    private NewsBO old_news;
    private CathegoryDO old_cath;
    private int response_code;

    public List<CathegoryDO> getCath_list() {
        return cath_list;
    }

    public void setCath_list(List<CathegoryDO> cath_list) {
        this.cath_list = cath_list;
    }

    public List<NewsBO> getNews_list() {
        return news_list;
    }

    public void setNews_list(List<NewsBO> news_list) {
        this.news_list = news_list;
    }

    public int getResponse_code() {
        return response_code;
    }

    public void setResponse_code(int response_code) {
        this.response_code = response_code;
    }

    public List<String> getSadwords() {
        return sadwords;
    }

    public void setSadwords(List<String> sadwords) {
        this.sadwords = sadwords;
    }

    public List<String> getSelected_cathegory() {
        return selected_cathegory;
    }

    public void setSelected_cathegory(List<String> selected_cathegory) {
        this.selected_cathegory = selected_cathegory;
    }

    public NewsBO getOld_news() {
        return old_news;
    }

    public void setOld_news(NewsBO old_news) {
        this.old_news = old_news;
    }

    public CathegoryDO getOld_cath() {
        return old_cath;
    }

    public void setOld_cath(CathegoryDO old_cath) {
        this.old_cath = old_cath;
    }
}
