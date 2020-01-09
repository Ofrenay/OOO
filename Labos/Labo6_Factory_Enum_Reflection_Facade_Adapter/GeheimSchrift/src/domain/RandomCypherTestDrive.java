package domain;

public class RandomCypherTestDrive {
    public static void main(String[] args) {
        GeheimschriftStrategy geheimschriftStrategySP = new Spiegelschrift();

        RandomCypher randomCypher = new RandomCypher();
        GeheimschriftStrategy randomCypherAdapter = new RandomCypherAdapter();

        String str = "Dit is zeer geheim";
        char[] c = str.toLowerCase().toCharArray();

        System.out.println(randomCypher.decypher(c));

    }

    static void testGeheimschriftStrategy(GeheimschriftStrategy geheimschriftStrategy){
        String str = "Dit is zeer geheim";

        geheimschriftStrategy.code(str);
        geheimschriftStrategy.decode(geheimschriftStrategy.code(str));
    }
}
