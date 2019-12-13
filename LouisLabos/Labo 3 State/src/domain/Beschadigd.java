package domain;
public class Beschadigd implements MateriaalStatus {

    FeestMateriaal feestMateriaal;

    public Beschadigd(FeestMateriaal feestMateriaal){
        this.feestMateriaal = feestMateriaal;
    }

    @Override
    public void uitlenen() {
        System.out.println("beschadigd feestmateriaal kan je niet uitlenen");
    }

    @Override
    public void verwijderen() {
        feestMateriaal.setMateriaalState(feestMateriaal.getVerwijderd());
    }

    @Override
    public void herstellen() {
        feestMateriaal.setMateriaalState(feestMateriaal.getUitleenbaar());
    }
}
