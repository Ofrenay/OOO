package domain;

public class GeheimschriftContext {
    GeheimschriftStrategy geheimschriftStrategy;

    public void setGeheimschriftStrategy(GeheimschriftStrategy geheimschriftStrategy) {
        this.geheimschriftStrategy = geheimschriftStrategy;
    }

    public String code(String s){
        return geheimschriftStrategy.code(s);
    }

    public String decode(String s){
        return geheimschriftStrategy.decode(s);
    }
}
