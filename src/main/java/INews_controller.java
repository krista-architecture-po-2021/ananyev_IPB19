public interface INews_controller {
    /*protected News_controller(){
        //System.out.println("Created News Controller");
    }*/

    /*protected String getAll(){
        return new String("All news");
    }*/
    String getAll();
    String getOne(String news_id);
    boolean AddOne(String news_id);
    boolean DeleteOne(String news_id);
    String updateNews(String news_id);
}
