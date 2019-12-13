package domain;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private ArrayList<Product> products = new ArrayList<>();

    public Shop(ArrayList products){
        this.products = products;
    }

    public void addProduct(Product p){
        products.add(p);
    }

    public Product getProduct(String title){
        Product result = null;
        for(Product p : products){
            if(p.getTitle().equalsIgnoreCase(title));
                return p;
        }
        return result;
    }

    public List<Product> getProducts(){
        return products;
    }

    public double getPrice(String id, int days){
        double price = 0;

        if(id.equalsIgnoreCase("M")){
            price = 5;
            int daysLeft = days - 3;

            if(daysLeft > 0)
                price += (daysLeft * 2);
        }

        else if(id.equals("G"))
            price = days * 3;

        return price;
    }

    public void close(){
        //TODO
    }
}
