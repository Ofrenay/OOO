package domain;

import java.util.ArrayList;

public class Geschenkendoos {
    private ArrayList<Geschenk> geschenken;

    public Geschenkendoos(Persoon schenker, Persoon ontvanger, Geschenk geschenk, ArrayList<Geschenk> geschenken){
        //null check geschenken
        if(geschenken == null)
            throw new IllegalArgumentException("Geschenken lijst mag niet leeg zijn");
        this.geschenken = geschenken;

        //Duplicates check
        for(Geschenk g : geschenken){
            if(g.equals(geschenk))
                throw new IllegalArgumentException("Duplicaten zijn niet toegestaan");
        }

        //Leeftijd Check
        if(geschenk instanceof HeeftMinLeeftijd){
            if(geschenk instanceof Boek) {
                if (((Boek) geschenk).getMinLeeftijd() > ontvanger.getLeeftijd())
                    throw new IllegalArgumentException("Minimumleeftijd voor dit Boek is hoger dan leeftijd ontvanger");
            }

            else if(geschenk instanceof Speelgoed){
                if(((Speelgoed) geschenk).getMinimumLeeftijd() > ontvanger.getLeeftijd())
                    throw new IllegalArgumentException("Minimum leeftijd is hoger dan leeftijd ontvanger");
            }
            geschenken.add(geschenk);
        }

        //Vervaldatum check
        if(geschenk instanceof HeeftVervalDatum){
            if(((Snoepgoed) geschenk).isVervallen())
                throw new IllegalArgumentException("Uw geschenk is vervallen");

            geschenken.add(geschenk);
        }
    }

    public double getTotaleprijs(){
        double totaal = 0.00;

        for(Geschenk g : this.geschenken){
            totaal += g.getPrijs();
        }

        return totaal;
    }

    public String toString(){
        String string = "";
        for(Geschenk g : geschenken){
            string += '\n' + g.toString();
        }
        return string;
    }

    public String expired(){
        String list = "";

        for(Geschenk s: geschenken){
            if(s instanceof Snoepgoed) {
                if (((Snoepgoed) s).isVervallen())
                    list += "\n" + s;
            }
        }

        return list;
    }
}
