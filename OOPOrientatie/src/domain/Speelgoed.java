package domain;

public class Speelgoed extends Geschenk implements HeeftMinLeeftijd {
    private String naam;
    private String firmaNaam;
    private int minimumLeeftijd;
    private double prijs;

    public Speelgoed(String naam, String firmaNaam, double prijs){
        super(prijs);
        if(naam.trim().isEmpty())
            throw new IllegalArgumentException("De naam van het speelgoed mag niet leeg zijn.");
        else
            this.naam = naam;

        if(firmaNaam.trim().isEmpty())
            throw new IllegalArgumentException("De firmanaam mag niet leeg zijn.");
        else
            this.firmaNaam = firmaNaam;
    }

    public Speelgoed(String naam, String firmaNaam, int minimumLeeftijd, double prijs){
        super(prijs);
        if(naam.trim().isEmpty())
            throw new IllegalArgumentException("De naam van het speelgoed mag niet leeg zijn.");
        else
            this.naam = naam;

        if(firmaNaam.trim().isEmpty())
            throw new IllegalArgumentException("De firmanaam mag niet leeg zijn.");
        else
            this.firmaNaam = firmaNaam;

        if(minimumLeeftijd > 21)
            throw new IllegalArgumentException("geeft een realistische minimum leeftijd in.");
        else
            this.minimumLeeftijd = minimumLeeftijd;
    }

    public int getMinimumLeeftijd() {
        return minimumLeeftijd;
    }

    @Override
    public String toString(){
        String string = "Naam: " + naam + "\nFirmanaam: " + firmaNaam + '\n' + super.toString();

        if(minimumLeeftijd != 0)
            string += "\nMinimum leeftijd: " +  minimumLeeftijd;

        return string;
    }

    @Override
    public int getMinLeeftijd() {
        return minimumLeeftijd;
    }
}
