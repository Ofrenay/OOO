package factories;

import java.lang.reflect.Constructor;

import domain.Personeelslid;


public enum PersoneelType {
	A ("Arbeider", "domain.Arbeider"),
	B ("Bediende", "domain.Bediende");
		

	private final String omschrijving;   
	private final String klasseNaam; 
		
	PersoneelType(String omschrijving, String klasseNaam) {
	    this.omschrijving = omschrijving;
	    this.klasseNaam = klasseNaam;
	}
		
	public String getOmschrijving() { return omschrijving; }
	public String getKlasseNaam() { return klasseNaam; }
}