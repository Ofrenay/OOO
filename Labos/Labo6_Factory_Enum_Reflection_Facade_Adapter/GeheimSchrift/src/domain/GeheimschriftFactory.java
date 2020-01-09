package domain;

public class GeheimschriftFactory {

    public String codeerTekst(String type, String woord){
        GeheimschriftEnum geheimschriftEnum = GeheimschriftEnum.valueOf(type);
        String klasse = geheimschriftEnum.getKlasse();
        GeheimschriftStrategy geheimschriftStrategy = null;

        try{
            Class dbClass = Class.forName(klasse);
            Object dbObject = dbClass.newInstance();
            geheimschriftStrategy = (GeheimschriftStrategy) dbObject;

        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e ) {
            e.printStackTrace();
        }

        return geheimschriftStrategy.code(woord);
    }
}
