package domain;

public class CD extends Product {
    public CD(String title, String id,String beschrijving){
        super(title, id,beschrijving);
    }
    @Override
    public double getPrice(int days){
        return days * 1.5;
    }

    @Override
    public String getCategorie() {
        return "CD";
    }
}
