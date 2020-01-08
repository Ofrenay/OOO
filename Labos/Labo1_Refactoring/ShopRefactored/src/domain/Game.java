package domain;

public class Game extends Product {
    public Game(String id, String title, String type){
        super(id, title, type);
    }

    @Override
    public double getPrice(int days){
        return days * 3;
    }
}
