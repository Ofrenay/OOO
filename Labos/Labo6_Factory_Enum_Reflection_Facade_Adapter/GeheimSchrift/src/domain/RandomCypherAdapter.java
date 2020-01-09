package domain;

public class RandomCypherAdapter implements GeheimschriftStrategy{
    RandomCypher randomCypher;

    public RandomCypherAdapter(){}

    @Override
    public String code(String s) {
        return String.valueOf(randomCypher.encypher(s.toCharArray()));
    }

    @Override
    public String decode(String s) {
        return String.valueOf(randomCypher.decypher(s.toCharArray()));
    }
}
