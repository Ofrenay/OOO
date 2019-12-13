package domain;

public class Verwijderd implements MateriaalStatus {

    FeestMateriaal feestMateriaal;

    Verwijderd(FeestMateriaal feestMateriaal) {
        this.feestMateriaal = feestMateriaal;
    }

    @Override
    public void uitlenen() {
        System.out.println("verwijderd feestmaretiaal kan je niet uitlenen");
    }

    @Override
    public void verwijderen() {
        System.out.println("verwijderd feestmaretiaal kan je niet verwijderen");
    }

    @Override
    public void herstellen() {
        System.out.println("verwijderd feestmaretiaal kan je niet herstellen");
    }

    @Override
    public void terugbrengen(boolean beschadigd) {
        System.out.println("Verwijderd materiaal kan niet worden teruggebracht");
    }

}
