package ui;

import domain.*;

public class App {

    public static void main(String args[]){
        GeheimschriftStrategy geheimschriftStrategyCS = new CaesarSchrift();
        GeheimschriftStrategy geheimschriftStrategySP = new Spiegelschrift();
        GeheimschriftStrategy geheimschriftStrategyRC = new RandomCypher();

        GeheimschriftContext geheimschriftContext = new GeheimschriftContext();

        geheimschriftContext.setGeheimschriftStrategy(geheimschriftStrategyCS);
        System.out.println(geheimschriftContext.code("Dit is zeer geheim").toLowerCase());

        geheimschriftContext.setGeheimschriftStrategy(geheimschriftStrategySP);
        System.out.println(geheimschriftContext.code("Dit is zeer geheim").toLowerCase());

        geheimschriftContext.setGeheimschriftStrategy(geheimschriftStrategyRC);
        System.out.println(geheimschriftContext.code("Dit is zeer geheim"));
    }
}
