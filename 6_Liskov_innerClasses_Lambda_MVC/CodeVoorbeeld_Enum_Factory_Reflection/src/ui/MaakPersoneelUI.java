package ui;
import factories.*;

public class MaakPersoneelUI {

	public static void main(String[] args) {
	  if (args.length < 3) {
	     System.out.println("Typ type(A of B),code,naam personeelslid");
		        System.exit(-1);
	  }
	  PersoneelType  personeelType = PersoneelType.valueOf(args[0]);
	  System.out.println(PersoneelslidFactory.createPersoneel 
                         (personeelType.getKlasseNaam(),args[1],args[2]));
	}

}
