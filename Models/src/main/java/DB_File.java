import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DB_File implements IDBase {
    private final char splitter = '~';
    private final String news_file = "news.txt";
    private final String cath_file = "cathegory.txt";
    /*private List<NewsDO> news_list = new ArrayList<>();
    private List<CathegoryDO> cath_list = new ArrayList<>();*/

    public List<NewsDO> getNews(String entityName){
        //NewsDAO newsDAO = new NewsDAO();
        List<NewsDO> news = new ArrayList<>();
        try {
            FileReader reader = new FileReader(entityName + ".txt");
            BufferedReader bfreader = new BufferedReader(reader);
            String line = bfreader.readLine();
            while(line != null)
            {
                String[] res = line.split(String.valueOf(splitter));
                String newsText = new String();
                for(int i = 1; i < res.length - 1; i++)
                    newsText += res[i];
                news.add(new NewsDO(newsText, res[0], res[res.length - 1]));
                line = bfreader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return news;
    }

    public List<CathegoryDO> getCath(String entityName){
        //CathegoriesDAO cathDAO = new CathegoriesDAO();
        List<CathegoryDO> cath = new ArrayList<>();
        try {
            FileReader reader = new FileReader(cath_file);
            BufferedReader bfreader = new BufferedReader(reader);
            String line = bfreader.readLine();
            while(line != null)
            {
                String[] res = line.split(String.valueOf(splitter));
                String cathText = new String();
                for(int i = 1; i < res.length; i++)
                    cathText += res[i];
                cath.add(new CathegoryDO(cathText, res[0]));
                line = bfreader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cath;
    }

    public boolean addNews(NewsDO news){
        try(FileWriter writer = new FileWriter(news_file, true))
        {
            writer.write(news.getId() + splitter + news.getNews_text() + splitter + news.getCathegory_id() + '\n');
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        //news_list.add(news);
        return true;
    }

    public boolean addCathegory(CathegoryDO cathegory){
        try(FileWriter writer = new FileWriter(cath_file, true))
        {
            writer.write(cathegory.getId() + splitter + cathegory.getCat_text()  + '\n');
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        //cath_list.add(cathegory);
        return true;
    }

    public boolean deleteNews(String news_id){
        List<NewsDO> news_list = getNews("news");
        int element_ind = searchforNews(news_id, news_list);
        if(element_ind == -1)
            return false;
        news_list.remove(element_ind);
        rewriteNewsList(news_list);
        return true;
    }

    public boolean deleteCath(String news_id){
        List<CathegoryDO> cath_list = getCath("cathegories");
        int element_ind = searchforCath(news_id, cath_list);
        if(element_ind == -1)
            return false;
        cath_list.remove(element_ind);
        rewriteCathList(cath_list);
        return true;
    }

    private void rewriteNewsList(List<NewsDO> news_list)
    {
        try(FileWriter writer = new FileWriter(news_file, false))
        {
            for (NewsDO newsDO : news_list) {
                writer.write(newsDO.getId() + splitter + newsDO.getNews_text() + splitter + newsDO.getCathegory_id() + '\n');
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void rewriteCathList(List<CathegoryDO> cath_list)
    {
        try(FileWriter writer = new FileWriter(cath_file, false))
        {
            for (CathegoryDO cathegoryDO : cath_list) {
                writer.write(cathegoryDO.getId() + splitter + cathegoryDO.getCat_text() + '\n');
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean updateNews(String old_id, NewsDO news){
        List<NewsDO> news_list = getNews("news");
        int element_id = searchforNews(old_id, news_list);
        if(element_id == -1)
            return false;
        news_list.set(element_id, news);
        rewriteNewsList(news_list);
        return true;
    }

    public boolean updateCath(String old_id, CathegoryDO cath){
        List<CathegoryDO> cath_list = getCath("cathegories");
        int element_id = searchforCath(old_id, cath_list);
        if(element_id == -1)
            return false;
        cath_list.set(element_id, cath);
        rewriteCathList(cath_list);
        return true;
    }

    public NewsDO getOneNews(String id){
        List<NewsDO> news_list = getNews("news");
        int ind = searchforNews(id, news_list);
        if(ind < 0)
            return null;
        return news_list.get(ind);
    }

    public CathegoryDO getOneCath(String id){
        List<CathegoryDO> cath_list = getCath("cathegories");
        int ind = searchforCath(id, cath_list);
        if(ind < 0)
            return null;
        return cath_list.get(ind);
    }


    private int searchforCath(String id, List<CathegoryDO> list) {
        int el_to_find = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id))
                el_to_find = i;
        }
        return el_to_find;
    }

    private int searchforNews(String id, List<NewsDO> list) {
        int el_to_find = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id))
                el_to_find = i;
        }
        return el_to_find;
    }
}
