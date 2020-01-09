package domain;

public enum GeheimschriftEnum {
    CAESAR("caesar", "domain.CaesarSchrift"),
    RANDOM("random", "domain.RandomCypher"),
    SPIEGEL("spiegel", "domain.spiegelSchrift");

    private final String naam;
    private final String klasse;

    GeheimschriftEnum(String naam, String klasse){
        this.naam = naam;
        this.klasse = klasse;
    }


    public String getNaam() {
        return naam;
    }

    public String getKlasse() {
        return klasse;
    }
}
