package ui;

import domain.CD;
import domain.Game;
import domain.Movie;
import domain.Shop;

public class ShopApp {

    public static void main(String[] args){
        Shop shop = new Shop("Video-Store");
        CD Queen = new CD("Queen","1","Eerste CD van Queen");
        Game Just_Cause = new Game("Just Cause 3", "2", "De derde uitgave van Just Cause");
        Movie Shawshank = new Movie("Shawshank Redemption","3","De film shawshank redemption");
    }
}
