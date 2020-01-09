package domain;

public class Spiegelschrift implements GeheimschriftStrategy {
    @Override
    public String code(String s) {
        if(s.length() == 1)
            return s;

        else{
            return s.charAt(s.length() -1) + code(s.substring(0,s.length()-1));
        }
    }

    @Override
    public String decode(String s) {
        return code(s);
    }
}

