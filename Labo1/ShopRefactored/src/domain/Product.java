package domain;

public class Product {
    private String id;
    private String title;
    private String type;

    public Product(String id, String title, String type){
        this.id = id;
        this.title = title;
        this.type = type;
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

        if(type.equalsIgnoreCase("Movie")) {
            price = 5;
            int daysLeft = days - 3;

            if (daysLeft > 0)
                price += daysLeft * 2;
        }

        else if( type.equalsIgnoreCase("Game"));
            price = days * 3;

        return price;
    }

    public String getType() {
        return type;
    }
}