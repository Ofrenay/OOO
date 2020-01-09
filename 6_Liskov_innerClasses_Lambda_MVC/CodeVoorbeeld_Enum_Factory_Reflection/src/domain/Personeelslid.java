package domain;

public abstract class Personeelslid {
	private String naam;
	private String code;
	
	public Personeelslid(String code, String naam) throws IllegalArgumentException{
		setCode(code);
		setNaam(naam);
	}
	
	public String getCode() {
		return code;
	}

	protected void setCode(String code) throws IllegalArgumentException{
		if (code == null){
			throw new IllegalArgumentException("Geen code");
		}
		this.code = code;
	}

	public String getNaam() {
		return naam;
	}
	
	
	protected void setNaam(String naam) throws IllegalArgumentException{
		if(naam == null) throw new IllegalArgumentException(
                                                         "Geen naam");
			this.naam = naam;
	}
	
		
	@Override
	public boolean equals(Object o){
		boolean result = false;
		if(o instanceof Personeelslid){
			Personeelslid p= (Personeelslid)o;
			if (p.getCode().equals(this.getCode())){
				result = true;
			}
		}
		return result;
	}

	@Override
	public String toString(){
		return  getClass().getSimpleName()+ " Code : " + this.getCode() + " Naam : " + this.getNaam();
	}	
}
