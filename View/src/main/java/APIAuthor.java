public class APIAuthor {
        private final IFacade facade;

        APIAuthor(IFacade facade){
            this.facade = facade;
        }

        public Message getAllNews(Message mes1) {
            return facade.getAllNews(mes1);
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
}
