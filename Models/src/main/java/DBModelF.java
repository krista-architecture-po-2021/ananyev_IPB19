public class DBModelF extends ModelFactory{
    /*INewsDAO newsDAO = new NewsDAO();*/
    private DB_File db = new DB_File();
    public DBModelF() {
        /*System.out.println("Created NewsModel");*/
    }

    /*public boolean addNews(NewsDO news) { return db.addNews(news); }

    public boolean addCathegory(CathegoryDO cathegory){ return db.addCathegory(cathegory); }

    public boolean deleteNews(String news_id) { return db.deleteNews(news_id); }

    public boolean deleteCath(String cath_id) { return db.deleteCath(cath_id); }

    public boolean updateNews(String old_id, NewsDO news) {
        return db.updateNews(old_id, news);
    }

    public boolean updateCath(String old_id, CathegoryDO cath) {
        return db.updateCath(old_id, cath);
    }*/

    public NewsDAO getNewsDao() {
        FormatProvider formatProvider = new FormatProvider(db);
        return new NewsDAO(formatProvider);
    }

    public CathegoriesDAO getCategoriesDao() {
        FormatProvider formatProvider = new FormatProvider(db);
        return new CathegoriesDAO(formatProvider);
    }
}
