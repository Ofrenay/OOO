package Domain;

public class Dobbelsteen {

    public Dobbelsteen(){}

    public int eenDobbelsteen(){
        return (int) (Math.random() * 6) + 1;
    }

    public int gooi(){
        int eersteWorp = eenDobbelsteen();
        int tweedeWorp = eenDobbelsteen();
        int score = eersteWorp + tweedeWorp;

        if(eersteWorp == tweedeWorp)
            score *= 2;

        return score;
    }
}
