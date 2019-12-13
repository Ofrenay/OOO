package domain;

public class GeheimschriftRandomKarakter implements GeheimschriftStrategy{
    RandomCypher randomCypher = new RandomCypher();


    @Override
    public String codeer(String s) {
       return String.valueOf(randomCypher.encypher(s.toCharArray()));
    }

    @Override
    public String decodeer(String s) {
        return String.valueOf(randomCypher.decypher(s.toCharArray()));
    }
}
