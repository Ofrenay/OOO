package ui;

import domain.Game;
import domain.Movie;
import domain.Product;
import domain.Shop;
import java.util.ArrayList;

public class ShopApp {
    public static void main(String args[]){
        Shop s1 = new Shop(new ArrayList<Product>());
        Product p1 = new Game("G", "Red Dead Redemption");
        s1.addProduct(p1);

        Product p2 = new Movie("M", "Titanic");
        s1.addProduct(p2);

        System.out.println(s1.getProduct("Titanic"));
        System.out.println(s1.getProducts());
        System.out.println(s1.getPrice("m", 5));

        System.out.println(p1.getTitle());
        System.out.println(p1.getId());
    }
}
