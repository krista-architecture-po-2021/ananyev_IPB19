import java.util.ArrayList;
import java.util.List;

public class Facade implements IFacade {
    private final INews_controller news_controller = new News_controller();
    //private final INews_controller news_controller = new DecorPositive(new News_controller());
    private final ICathegory_controller cathegory_controller = new Cathegory_controller();
    List<String> sadWords, selectedCathegory;

    public Message setFilters(Message mes)
    {
        this.sadWords = mes.getSadwords();
        this.selectedCathegory = mes.getSelected_cathegory();
        mes.setResponse_code(404);
        return mes;
    }

    public Message clearFilters(Message mes){
        mes.setResponse_code(400);
        if(sadWords != null)
            sadWords.clear();
        if(selectedCathegory != null)
            selectedCathegory.clear();
        mes.setResponse_code(200);
        return mes;
    }

    private INews_controller getNewsContoroller()
    {
        INews_controller c = new News_controller();
        if((sadWords != null)&&(sadWords.size() > 0))
            c = new DecorWords(sadWords, c);
        if((selectedCathegory != null)&&(selectedCathegory.size() > 0))
            c = new DecorCathegory(selectedCathegory, c);
        return c;
    }

    private String getCathIDbyName(CathegoryDO cath){
        String cath_id = null;
        List<CathegoryDO> cath_list = cathegory_controller.getAll();
        for(CathegoryDO caths : cath_list){
            if(caths.getCat_text().equals(cath.getCat_text())) {
                cath_id = caths.getId();
                break;
            }
        }
        return cath_id;
    }

    private String getCathIDbyNews(NewsBO news){
        List<CathegoryDO> cath_list = cathegory_controller.getAll();
        String cathegory_id = null;
        for (CathegoryDO cath : cath_list)
            if (cath.getCat_text().equals(news.getCathegory())) {
                cathegory_id = cath.getId();
                break;
            }
        return cathegory_id;
    }

    public Message getAllNews(Message mes) {
        mes.setNews_list(getNewsContoroller().getAll());
        mes.setResponse_code(200);
        return mes;
    }

    public Message getOne(Message mes) {
        List<NewsBO> news_list = mes.getNews_list();
        if(news_list == null) {
            mes.setResponse_code(400);
            return mes;
        }
        List <NewsBO> news_list_ret = new ArrayList<>();
        news_list_ret.add(news_controller.getOne(mes.getNews_list().get(0).getId()));
        mes.setNews_list(news_list_ret);
        mes.setResponse_code(200);
        return mes;
    }

    public Message addNews(Message mes) {
        List<NewsDO> news_list_do = new ArrayList<>();

        List<NewsBO> news_list = mes.getNews_list();
        for(NewsBO news : news_list) {
            String cathegory_id = getCathIDbyNews(news);

            if (cathegory_id == null) {
                mes.setResponse_code(400);
                return mes;
            }
            news_list_do.add(new NewsDO(news.getNews_text(), news.getId(), cathegory_id));
        }
        mes.setResponse_code(400);
        if (news_controller.AddNews(news_list_do))
            mes.setResponse_code(200);
        return mes;
    }

    public Message deleteNews(Message mes) {
        NewsBO news = mes.getNews_list().get(0);
        if(news == null) {
            mes.setResponse_code(400);
            return mes;
        }

        mes.setResponse_code(400);
        if(news_controller.DeleteOne(news.getId()))
            mes.setResponse_code(200);
        return mes;
    }



    public Message updateNews(Message mes) {
        NewsBO old_news = mes.getOld_news();
        NewsBO new_news = mes.getNews_list().get(0);
        if((old_news == null)||(new_news == null))
        {
            mes.setResponse_code(400);
            return mes;
        }
        String cathegory_id = getCathIDbyNews(new_news);
        if(cathegory_id == null)
        {
            mes.setResponse_code(400);
            return mes;
        }

        mes.setResponse_code(400);
        if(news_controller.updateNews(old_news.getId(), new_news.getNews_text(), new_news.getId(), cathegory_id))
            mes.setResponse_code(200);
        return mes;
    }

    public Message getCathegoryList(Message mes) {
        mes.setCath_list(cathegory_controller.getAll());
        mes.setResponse_code(200);
        return mes;
    }

    public Message addCathegory(Message mes) {
        List<CathegoryDO> cath_list = mes.getCath_list();
        if(cath_list == null)
        {
            mes.setResponse_code(400);
            return mes;
        }

        mes.setResponse_code(400);
        if(cathegory_controller.addCaths(cath_list))
            mes.setResponse_code(200);
        return mes;
    }

    public Message deleteCathegory(Message mes) {
        CathegoryDO cath = mes.getCath_list().get(0);
        if(cath == null)
        {
            mes.setResponse_code(400);
            return mes;
        }

        String cath_id = getCathIDbyName(cath);

        mes.setResponse_code(400);
        if(cath_id == null)
            return mes;
        if(cathegory_controller.deleteOne(cath_id))
            mes.setResponse_code(200);
        return mes;
    }

    public Message updateCathegory(Message mes) {
        CathegoryDO new_cath = mes.getCath_list().get(0);
        CathegoryDO old_cath = mes.getOld_cath();
        if((new_cath == null)||(old_cath == null))
        {
            mes.setResponse_code(400);
            return mes;
        }

        String cath_id_old = getCathIDbyName(old_cath);
        mes.setResponse_code(400);
        if(cath_id_old== null)
            return mes;

        if(cathegory_controller.updateOne(cath_id_old, new_cath.getCat_text(), new_cath.getId()))
            mes.setResponse_code(200);
        return mes;
    }
}

