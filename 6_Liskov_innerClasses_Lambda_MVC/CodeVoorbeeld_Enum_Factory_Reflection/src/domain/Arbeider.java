package domain;

public class Arbeider extends Personeelslid {
	private double uurloon;
	
	
	public Arbeider(String code, String naam) 
                     throws IllegalArgumentException{
		super(code,naam);
	}
	
	public Arbeider(String code, String naam, Double uurloon) 
                     throws IllegalArgumentException{
		super(code,naam);
		this.setUurloon(uurloon);
	}

	public double getUurloon() {
		return uurloon;
	}

	public void setUurloon(double uurloon) throws IllegalArgumentException    {
		if (uurloon <= 0) throw new IllegalArgumentException(
                                  "uurloon moet strikt positief zijn");
		this.uurloon = uurloon;
	}
	
	@Override
	public String toString() {
		return super.toString() + " uurloon:"+getUurloon();
	}	
}
