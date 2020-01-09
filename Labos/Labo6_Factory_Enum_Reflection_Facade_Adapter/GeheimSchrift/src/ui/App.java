package ui;

import domain.*;

public class App {

    public static void main(String args[]){
        GeheimschriftFactory geheimschriftFactory = new GeheimschriftFactory();
        System.out.println(geheimschriftFactory.codeerTekst("RANDOM", "oscar"));
    }
}
