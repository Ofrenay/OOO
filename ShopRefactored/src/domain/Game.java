package domain;

public class Game extends Product {
    public Game(String id, String title){
        super(id, title);
    }

    @Override
    public double getPrice(int days){
        return days * 3;
    }
}
