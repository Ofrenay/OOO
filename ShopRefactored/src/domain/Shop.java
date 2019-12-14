package domain;

import java.util.ArrayList;
import java.util.*;

public class Shop {
    
    private String naam;
    private List<Product> products;

    public Shop(String naam){
        products = new ArrayList<>();
        this.naam = naam;
    }

    public void addProduct(String title, String type){
        String id = String.valueOf(products.size() + 1);
        Product product = null;
        
        if(type.equalsIgnoreCase("Movie"))
            product = new Movie(id, title, type);

        else
            product = new Game(id, title, type);

        products.add(product);
    }

    public Product getProduct(String id){
        Product result = null;
        for(Product p : products){
            if(p.getTitle().equalsIgnoreCase(id)) {
                result = p;
                break;
            }
        }
        if(result == null)
            throw new IllegalArgumentException("Product niet geveonden ");

        return result;
    }

    public List<Product> getProducts(){
        List<Product> result = new ArrayList<>();

        for(Product p : products){
            if(p.getType().equalsIgnoreCase("Movie"))
                result.add(p);
        }

        for(Product p : products){
            if(p.getType().equalsIgnoreCase("Games"))
                result.add(p);
        }

        return result;
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
        products.clear();
    }
}
