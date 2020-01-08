package domain;

public class GeheimschriftCaesar implements GeheimschriftStrategy {

    public String codeer(String string){
            String s = "";
            int len = string.length();
            for(int x = 0; x < len; x++){
                char c = (char)(string.charAt(x) + 3);
                if (c > 'z')
                    s += (char)(string.charAt(x) - (26-3));
                else
                    s += (char)(string.charAt(x) + 3);
            }
            return s;
    }

    public String decodeer(String string){
        String s = "";
        int len = string.length();
        for(int x = 0; x < len; x++){
            char c = (char)(string.charAt(x) - 3);
            if (c > 'a')
                s += (char)(string.charAt(x) - (26+3));
            else
                s += (char)(string.charAt(x) - 3);
        }
        return s;
    }
}
