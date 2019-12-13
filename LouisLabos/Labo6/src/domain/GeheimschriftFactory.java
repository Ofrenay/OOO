package domain;

public class GeheimschriftFactory {

    public String codeerTekst(String type, String woord){
        GeheimshriftEnum geheimshriftEnum = GeheimshriftEnum.valueOf(type);
        String klasse = geheimshriftEnum.getKlasse();
        GeheimschriftStrategy geheimschriftStrategy = null;
        try {
            Class dbClass = Class.forName(klasse);
            Object dbObject = dbClass.newInstance();
            geheimschriftStrategy = (GeheimschriftStrategy) dbObject;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return geheimschriftStrategy.codeer(woord);
    }



}
