public abstract class ModelFactory {
    private static final int JSON = 1;
    private static final int DB = 2;

    public abstract INewsDAO getNewsDao();
    public abstract ICathegoriesDAO getCategoriesDao();

    private static DBModel dbModel = new DBModel();

    public static ModelFactory getModel(int value) {
        //if (value == JSON) return new JsonModel();
        return dbModel;
    }

    public abstract boolean addNews(NewsDO news);

    public abstract boolean deleteNews(String news_id);

    public abstract boolean updateNews(String old_id, NewsDO news);

    public abstract boolean addCathegory(CathegoryDO cathegory);

    public abstract boolean deleteCath(String cath_id);

    public abstract boolean updateCath(String old_id, CathegoryDO cath);

}
