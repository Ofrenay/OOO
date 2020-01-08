package domain;

public enum GeheimshriftEnum {
    CAESAR("Caesar", "domain.GeheimschriftCaesar"),
    RANDOM("Random", "domain.GeheimschriftRandomKarakter"),
    SPIEGEL("Spiegel", "domain.GeheimschriftCaesar");


    private final String name;
    private final String klasse;

    private GeheimshriftEnum(String name, String klasse){
        this.name = name;
        this.klasse = klasse;
    }

    public String getName() {
        return name;
    }

    public String getKlasse() {
        return klasse;
    }
}
