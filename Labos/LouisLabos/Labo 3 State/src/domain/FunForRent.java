package domain;

import java.util.ArrayList;

public class FunForRent {

    ArrayList<FeestMateriaal> feestMateriaals;
    String naam;

    FunForRent(String naam){
        this.naam = naam;
        feestMateriaals = new ArrayList<>();
    }

    public void  addFeestMateriaal(FeestMateriaal feestMateriaal){
        feestMateriaals.add(feestMateriaal);
    }

    public ArrayList<FeestMateriaal> getFeestMateriaalen(){
        return feestMateriaals;
    }

    public FeestMateriaal getFeestMateriaal(int index){
        return feestMateriaals.get(index);
    }

}
