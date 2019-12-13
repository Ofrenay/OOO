package ui;

import domain.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main(String args[]){
        try {
            Persoon Pieter = new Persoon("Pieter", "post", LocalDate.of(1998, 12, 1));
            Persoon Andy = new Persoon("Andy", "Peelman", LocalDate.of(1999, 12, 11));
            Persoon Erik = new Persoon("Erek", "DoeRustag", LocalDate.of(1984, 12, 15));

            Geschenk g1 = new Speelgoed("traktor", "kne'x", 18, 35.50);
            Geschenk g2 = new Snoepgoed("veters", LocalDate.of(2020, 12, 3), 20.03);
            Geschenk g3 = new Boek("Aspe", "Schrijver", 100, 10.00);

            Geschenkendoos PtA = new Geschenkendoos(Pieter, Andy, g1, new ArrayList<>());
            Geschenkendoos EtP = new Geschenkendoos(Erik, Pieter, g2, new ArrayList<>());
            Geschenkendoos AtE = new Geschenkendoos(Andy, Erik, g3, new ArrayList<>());


            System.out.println(PtA.toString());
            System.out.println("Totale prijs: " + PtA.getTotaleprijs() + '\n');

            System.out.println(EtP.toString());
            System.out.println("Totale prijs: " + EtP.getTotaleprijs() + '\n');

            System.out.println(AtE.toString());
            System.out.println("Totale prijs: " + AtE.getTotaleprijs() + '\n');
        }
        catch (IllegalArgumentException m){
            System.out.println(m.getMessage());
        }
    }
}
