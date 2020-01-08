package domain;

import java.util.Objects;

public class Geschenk {
    private double prijs;

    public Geschenk(double prijs){
        this.prijs = prijs;
    }

    public double getPrijs() {
        return prijs;
    }

    public boolean equals(Object o){
        //null check
        if(o == null)
            return false;

        //type check
        if(o.getClass() != getClass())
            return false;

        //typecast
        Geschenk geschenk  = (Geschenk) o;

        //comparison
        return Objects.equals(prijs, geschenk.prijs);
    }

    @Override
    public String toString(){
        return "Prijs: " + getPrijs();
    }
}
