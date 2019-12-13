package domain;

public class Uitgeleend implements   MateriaalStatus{

    private FeestMateriaal feestMateriaal;

    public Uitgeleend(FeestMateriaal feestMateriaal){
        this.feestMateriaal = feestMateriaal;
    }


    @Override
    public void uitlenen() {
        System.out.println("Uitgeleend materiaal kan niet uitgeleend worden");
    }

    @Override
    public void verwijderen() {
        System.out.println("Uitgeleend materiaal kan niet hersteld worden");
    }

    @Override
    public void herstellen() {
        System.out.println("Uitgeleend materiaal kan niet hersteld worden");
    }

    @Override
    public void terugbrengen(boolean beschadigd) {
      if(!beschadigd){
          System.out.println("Je bracht intact materiaal terug");
          feestMateriaal.setMateriaalState(feestMateriaal.getUitleenbaar());
      }
      else {
          feestMateriaal.setMateriaalState(feestMateriaal.getBeschadigd());
          System.out.println("HEYEKK HET MATERIAAL IS KAPOT");
      }
    }

}
