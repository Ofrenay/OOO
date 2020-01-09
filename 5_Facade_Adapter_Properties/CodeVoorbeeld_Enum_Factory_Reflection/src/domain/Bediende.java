package domain;

public class Bediende extends Personeelslid {
	private double maandloon;

	public Bediende(String code, String naam) 
                              throws IllegalArgumentException{
		super(code,naam);
	}
	
	public Bediende(String code, String naam, Double maandloon) 
                               throws IllegalArgumentException{
		super(code,naam);
		this.setMaandloon(maandloon);
	}

	private double getMaandloon() {
		return maandloon;
	}

	private void setMaandloon(double maandloon) 
                                throws IllegalArgumentException{
		if (maandloon <= 0) throw new IllegalArgumentException
                           ("maandloon met strikt positief zijn");
		this.maandloon = maandloon;
	}	
	
	@Override
	public String toString() {
		return super.toString() + " maandloon:"+getMaandloon();
	}
}
