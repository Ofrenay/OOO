package ui;

import domain.*;

public class GeheimschriftUI {

    public static void main(String args[]){
        GeheimschriftFactory geheimschriftFactory = new GeheimschriftFactory();
        System.out.println(geheimschriftFactory.codeerTekst("CAESAR","bobbe"));

    }

}
