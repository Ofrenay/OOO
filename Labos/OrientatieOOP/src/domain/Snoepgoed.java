package domain;

import java.time.LocalDate;

public class Snoepgoed extends Geschenk implements HeeftVervalDatum{
    private String naam;
    private LocalDate vervalDatum;
    private double prijs;

    public Snoepgoed(String naam, LocalDate vervalDatum, double prijs) {
        super(prijs);
        if (naam.trim().isEmpty())
            throw new IllegalArgumentException("naam van het snoepgoed mag niet leeg zijn");
        else
            this.naam = naam;

        if (vervalDatum == null)
            throw new IllegalArgumentException("vervaldatum mag niet leeg zijn");
        else
            this.vervalDatum = vervalDatum;

    }


    public boolean isVervallen() {
        if (LocalDate.now().isAfter(vervalDatum))
            return true;

        return false;
    }

    @Override
    public String toString(){
        return "naam: " + naam + "\nvervaldatum: " + vervalDatum + '\n' + super.toString();
    }

    @Override
    public LocalDate getVervalDatum() {
        return vervalDatum;
    }
}
