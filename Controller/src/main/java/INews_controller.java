import java.util.List;

public interface INews_controller {
    /*protected News_controller(){
        //System.out.println("Created News Controller");
    }*/

    /*protected String getAll(){
        return new String("All news");
    }*/
    List<News> getAll();
    News getOne(String news_id);
    boolean AddOne(String news_text, String news_id, String cathegory);
    boolean DeleteOne(String news_id);
    boolean updateNews(String old_id, String news_text, String news_id, String cathegory);
}
