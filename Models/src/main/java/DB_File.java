public class DB_File {
    private writeF(list){

    }

    public NewsDAO getNewsDAO(){
        NewsDAO newsDAO = new NewsDAO();
        newsDAO.add(news_list);
        return newsDAO;
    }

    public CathegoriesDAO getCathDAO(){
        CathegoriesDAO cathDAO = new CathegoriesDAO();
        cathDAO.add(cath_list);
        return cathDAO;
    }

    public boolean addNews(NewsDO news){
        news_list.add(news);
        return true;
    }

    public boolean addCathegory(CathegoryDO cathegory){
        cath_list.add(cathegory);
        return true;
    }

    public boolean deleteNews(String news_id){
        int element_ind = searchforNews(news_id);
        if(element_ind == -1)
            return false;
        news_list.remove(element_ind);
        return true;
    }

    public boolean deleteCath(String news_id){
        int element_ind = searchforCath(news_id);
        if(element_ind == -1)
            return false;
        cath_list.remove(element_ind);
        return true;
    }

    public boolean updateNews(String old_id, NewsDO news){
        int element_id = searchforNews(old_id);
        if(element_id == -1)
            return false;
        news_list.set(element_id, news);
        return true;
    }

    public boolean updateCath(String old_id, CathegoryDO cath){
        int element_id = searchforCath(old_id);
        if(element_id == -1)
            return false;
        cath_list.set(element_id, cath);
        return true;
    }


    private int searchforCath(String id) {
        int el_to_find = -1;
        for (int i = 0; i < cath_list.size(); i++) {
            if (cath_list.get(i).getId().equals(id))
                el_to_find = i;
        }
        return el_to_find;
    }

    private int searchforNews(String id) {
        int el_to_find = -1;
        for (int i = 0; i < news_list.size(); i++) {
            if (news_list.get(i).getId().equals(id))
                el_to_find = i;
        }
        return el_to_find;
    }
}
