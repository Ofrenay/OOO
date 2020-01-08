package domain;

public class Uitleenbaar implements MateriaalStatus {
    FeestMateriaal feestMateriaal;
    public Uitleenbaar(FeestMateriaal feestMateriaal) {
        this.feestMateriaal = feestMateriaal;
    }

    @Override
    public void uitlenen(){
        System.out.println("Feestmateriaal is uitgeleend");
        feestMateriaal.setMateriaalState(feestMateriaal.getUitgeleend());
    }

    @Override
    public void verwijderen() {
        System.out.println("Je verwijdert het feestmateriaal");
        feestMateriaal.setMateriaalState(feestMateriaal.getVerwijderd());
    }

    @Override
    public void herstellen() {
        System.out.println("Uitleenbaar materiaal kan je niet herstellen");
    }

    @Override
    public void terugbrengen(boolean beschadigd) {
        System.out.println("Uitleenbaar materiaal kan niet worden teruggebracht");
    }
}
