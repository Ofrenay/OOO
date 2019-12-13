package domain;

public class GeheimschriftContext {
    GeheimschriftStrategy geheimschriftStrategy;

    public GeheimschriftContext(){}

    public void setGeheimschriftStrategy(GeheimschriftStrategy geheimschriftStrategy) {
        this.geheimschriftStrategy = geheimschriftStrategy;
    }
    public String codeer(String s){
        return geheimschriftStrategy.codeer(s);
    }
    public String decodeer(String s){
        return geheimschriftStrategy.decodeer(s);
    }
}
