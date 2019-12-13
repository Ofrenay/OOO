package domain;

public abstract class Product {
    String id, title,beschrijving;

    public Product(String title, String id,String beschrijving){
        setTitle(title);
        setId(id);
        setBeschrijving(beschrijving);
    }

    private void setBeschrijving(String beschrijving) {
        if(beschrijving == null || beschrijving.trim().isEmpty()){
            throw new IllegalArgumentException("Beschrijving is leeg");
        }
        this.beschrijving = beschrijving;
    }

    private void setTitle(String title){
        if(title == null || title.trim().isEmpty()){
            throw new IllegalArgumentException("Titel is leeg");
        }
        this.title = title;
    }
    private void setId(String id){
        if(id == null || id.trim().isEmpty()){
            throw new IllegalArgumentException("id is leeg");
        }
        this.id = id;
    }
    abstract double getPrice(int price);

    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    public abstract String getCategorie();

    public String getBeschrijving(){
        return beschrijving;
    }
}
