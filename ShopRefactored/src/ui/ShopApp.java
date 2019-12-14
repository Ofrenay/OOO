package ui;

import domain.Game;
import domain.Movie;
import domain.Product;
import domain.Shop;
import java.util.ArrayList;

public class ShopApp {
    public static void main(String args[]){

        Shop s1 = new Shop("bij den eddie");

        Product p1 = new Game("1", "Red Dead Redemption", "game");
        s1.addProduct("Red Dead Redemption", "Game");

        Product p2 = new Movie("2", "Titanic", "movie");
        s1.addProduct("Titanic", "Movie");

        Game p3 = new Game("3", "Just Cause 3", "game");
        s1.addProduct("Just Cause 3", "game");

        System.out.println(s1.getProduct("Titanic"));
        System.out.println(s1.getProducts());
        System.out.println(s1.getPrice("m", 5));

        System.out.println(p1.getTitle());
        System.out.println(p1.getType());
        System.out.println(p1.getId());
        System.out.println(p1.getPrice(5) + "EUK\n");

        System.out.println(p2.getTitle());
        System.out.println(p2.getType());
        System.out.println(p2.getId());
        System.out.println(p2.getPrice(4) + "EUK\n");

        System.out.println(p3.getTitle());
        System.out.println(p3.getType());
        System.out.println(p3.getId());
        System.out.println(p3.getPrice(1) + "EUK\n");
    }
}
