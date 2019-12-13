package domain;

public class Game extends Product {
    public Game(String title, String id,String beschrijving){
        super(title, id,beschrijving);
    }
    @Override
    public double getPrice(int days){
        return days * 3;
    }

    @Override
    public String getCategorie() {
        return "Game";
    }
}
