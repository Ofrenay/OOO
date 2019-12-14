package domain;

public class Movie extends Product {
    public Movie(String id, String title, String type){
        super(id, title, type);
    }

    @Override
    public double getPrice(int days){
        double price = 5;
        int daysLeft = days - 3;

        if(daysLeft > 0)
            price += (daysLeft * 2);

        return price;
    }
}
