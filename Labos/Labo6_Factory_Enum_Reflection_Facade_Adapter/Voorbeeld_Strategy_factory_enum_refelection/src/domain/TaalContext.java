package domain;

import java.util.ArrayList;
import java.util.List;


public class TaalContext {
	private domain.TaalInterface taalInterface;
	
	public TaalContext(){}
	
	public void setTaalInterface(domain.TaalInterface taalInterface){
		this.taalInterface = taalInterface;
	}
	
	public String getAanspreking(){
		return taalInterface.getAanspreking();
	}
	
	public List<String> getTaalLijst(){
		List <String> taalLijst = new ArrayList<>();
		for (domain.TaalEnum taal: domain.TaalEnum.values()){
			taalLijst.add(taal.toString());
		}
		return taalLijst;
	}
	
}
