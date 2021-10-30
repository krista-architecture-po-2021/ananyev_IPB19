public class APIClient {
    private final IFacade facade;

    APIClient(IFacade facade){
        this.facade = facade;
    }

    public Message getAllNews(Message mes1) {
        return facade.getAllNews(mes1);
    }

    public Message setfilters(Message mes1){
        return facade.setFilters(mes1);
    }

    public Message clearFilters(Message mes){ return facade.clearFilters(mes); }

    public Message getOne(Message mes){
        return facade.getOne(mes);
    }

    public Message getCathegoryList(Message mes){
        return facade.getCathegoryList(mes);
    }
}
