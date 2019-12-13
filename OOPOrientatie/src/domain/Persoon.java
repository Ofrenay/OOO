package domain;

import java.time.LocalDate;
import java.util.Objects;

public class Persoon {
    private String naam;
    private String voornaam;
    private LocalDate geboorteDatum;

    public Persoon(String naam, String voornaam, LocalDate geboorteDatum){
        this.naam = naam;
        this.voornaam = voornaam;
        this.geboorteDatum = geboorteDatum;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public int getLeeftijd(){
        int leeftijd = LocalDate.now().getYear() - geboorteDatum.getYear();

        if(geboorteDatum.plusYears(leeftijd).isAfter(LocalDate.now()))
            leeftijd -= 1;

        return leeftijd;
    }

    public boolean equals(Object o){
        if(o == null)
            return false;

        if(getClass() != o.getClass())
            return false;

        Persoon persoon = (Persoon) o;

        return Objects.equals(naam, persoon.naam) && Objects.equals(voornaam, persoon.voornaam)
                && Objects.equals(geboorteDatum, persoon.geboorteDatum);
    }
}
