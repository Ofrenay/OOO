package domain;

import java.util.*;

public class Shop {

    private String naam;
    List<Product> producten;

    public Shop(String naam){ //in uml is er een String als parameter, geen idee wat deze moet zijn
        producten = new ArrayList<>();
        this.naam = naam;
    }

    public void addProduct(String titel,String beschrijving,String categorie){
        String id = String.valueOf(producten.size() + 1);
        Product product;
        if(categorie.equals("Movie")){
             product = new Movie(titel,id,beschrijving);
        }
        if(categorie.equals("Game")){
             product = new Game(titel,id,beschrijving);
        }
        else {
             product = new CD(titel,id,beschrijving);
        }
        producten.add(product);
    }

    public Product getProduct(String id){
     Product gezochteProduct = null;
        for(Product p : producten){
            if(p.id.equals(id)){
                gezochteProduct = p;
                break;
            }
        }
        if(gezochteProduct == null){
            throw new IllegalArgumentException("Product niet gevonden");
        }
        return gezochteProduct;
    }

    public List<Product> getProducts(){
        ArrayList<Product> res = new ArrayList<>();
        for (Product p:producten){
            if(p.getCategorie().equals("Movie")){
                res.add(p);
            }
        }

        for (Product p:producten){
            if(p.getCategorie().equals("Game")){
                res.add(p);
            }
        }
        for (Product p:producten){
            if(p.getCategorie().equals("CD")){
                res.add(p);
            }
        }

        return res;
    }

    //niet zeker dat de String hier de titel moet zijn, geen idee wat het moet zijn eig, index lijkt me voldoende.
    // moet dit de totale prijs van alle producten zijn of van een bepaald item in de lijst??
    public double getPrice(String titel, int index){
     //TODO
     return 0;
    }
    public void close(){
        producten.clear();
    }
}
