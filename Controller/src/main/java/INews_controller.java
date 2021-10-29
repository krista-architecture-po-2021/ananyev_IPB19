import java.util.List;

public interface INews_controller {
    /*protected News_controller(){
        //System.out.println("Created News Controller");
    }*/

    /*protected String getAll(){
        return new String("All news");
    }*/
    List<NewsBO> getAll();
    NewsBO getOne(String news_id);
    boolean AddNews(List<NewsDO> news_list);
    boolean DeleteOne(String news_id);
    boolean updateNews(String old_id, String news_text, String news_id, String cathegory);
}
