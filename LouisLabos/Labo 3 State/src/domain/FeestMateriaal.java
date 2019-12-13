package domain;

public class FeestMateriaal {

    private MateriaalStatus uitgeleend;
    private MateriaalStatus beschadigd;
    private MateriaalStatus uitleenbaar;
    private MateriaalStatus verwijderd;

    private MateriaalStatus state = uitleenbaar;

    public FeestMateriaal(){
        uitgeleend = new Uitgeleend(this);
        beschadigd = new Beschadigd(this);
        uitleenbaar = new Uitleenbaar(this);
        verwijderd = new Verwijderd(this);
    }

    public void uitlenen(){
        state.uitlenen();
    }

    public void setMateriaalState(MateriaalStatus materiaalState){
        state = materiaalState;
    }

    public MateriaalStatus getUitgeleend(){
        return uitgeleend;
    }

    public MateriaalStatus getBeschadigd() {
        return beschadigd;
    }

    public MateriaalStatus getUitleenbaar(){
        return uitleenbaar;
    }

    public MateriaalStatus getVerwijderd() {
        return verwijderd;
    }
}
