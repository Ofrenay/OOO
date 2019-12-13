package domain;

public class GeheimschrijftSpiegeling implements GeheimschriftStrategy {
    public String codeer(String s){
        if(s.length() == 1){
            return s;
        }
        else{
            return s.charAt(s.length()-1) + codeer(s.substring(0,s.length()-1));
        }
    }

    public String decodeer(String s){
        return codeer(s);
    }
}
