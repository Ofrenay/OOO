package ui;

import domain.CaesarSchrift;
import domain.GeheimschriftContext;
import domain.GeheimschriftStrategy;
import domain.Spiegelschrift;

public class App {

    public static void main(String args[]){
        GeheimschriftStrategy geheimschriftStrategyCS = new CaesarSchrift();
        GeheimschriftStrategy geheimschriftStrategySP = new Spiegelschrift();
        GeheimschriftContext geheimschriftContext = new GeheimschriftContext();

        geheimschriftContext.setGeheimschriftStrategy(geheimschriftStrategyCS);
        System.out.println(geheimschriftContext.code("Dit is zeer geheim").toLowerCase());

        geheimschriftContext.setGeheimschriftStrategy(geheimschriftStrategySP);
        System.out.println(geheimschriftContext.code("Dit is zeer geheim").toLowerCase());
    }
}
