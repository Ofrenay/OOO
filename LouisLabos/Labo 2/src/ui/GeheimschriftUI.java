package ui;

import domain.GeheimschriftCaesar;
import domain.GeheimschriftContext;
import domain.GeheimschriftStrategy;
import domain.GeheimschrijftSpiegeling;

public class GeheimschriftUI {

    public static void main(String args[]){
        GeheimschriftStrategy geheimschriftStrategyCZ = new GeheimschriftCaesar();
        GeheimschriftStrategy geheimschriftStrategySP = new GeheimschrijftSpiegeling();
        GeheimschriftContext geheimschriftContext = new GeheimschriftContext();
        geheimschriftContext.setGeheimschriftStrategy(geheimschriftStrategyCZ);
        System.out.println(geheimschriftContext.codeer("maakt ni uit"));
        geheimschriftContext.setGeheimschriftStrategy(geheimschriftStrategySP);
        System.out.println(geheimschriftContext.codeer("maakt ni uit"));


    }

}
