public class APIAdmin {
    private final IFacade facade;

    APIAdmin(IFacade facade){
        this.facade = facade;
    }

    public Message getAllNews(Message mes1) {
        return facade.getAllNews(mes1);
    }

    public Message setfilters(Message mes1){
        return facade.setFilters(mes1);
    }

    public Message getOne(Message mes){
        return facade.getOne(mes);
    }

    public Message addNews(Message mes){
        return facade.addNews(mes);
    }

    public Message deleteNews(Message mes){
        return facade.deleteNews(mes);
    }

    public Message updateNews(Message mes){
        return facade.updateNews(mes);
    }

    public Message getCathegoryList(Message mes){
        return facade.getCathegoryList(mes);
    }

    public Message addCathegory(Message mes){
        return facade.addCathegory(mes);
    }

    public Message deleteCathegory(Message mes){
        return facade.deleteCathegory(mes);
    }

    public Message updateCathegory(Message mes){
        return facade.updateCathegory(mes);
    }
}
