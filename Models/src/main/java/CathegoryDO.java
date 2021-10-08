public class CathegoryDO {
    private String cat_text;
    private String id;

    public CathegoryDO(String text, String id){
        setCat_text(text);
        setId(id);
    }

    public String getCat_text() {
        return cat_text;
    }

    public void setCat_text(String cat_text) {
        this.cat_text = cat_text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
