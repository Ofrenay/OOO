package domain;

public class Product {
    private String id;
    private String title;

    public Product(String id, String title){
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice(int days){
        double price = 0;

        if(id.equalsIgnoreCase("M")) {
            price = 5;
            int daysLeft = days - 3;

            if (daysLeft > 0)
                price += daysLeft * 2;
        }

        else if( id.equalsIgnoreCase("G"));
            price = days * 3;

        return price;
    }
}