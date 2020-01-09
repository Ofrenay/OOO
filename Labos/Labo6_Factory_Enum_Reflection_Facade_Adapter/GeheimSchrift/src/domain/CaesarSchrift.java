package domain;

public class CaesarSchrift implements GeheimschriftStrategy{

    @Override
    public String code(String string){
        String s = "";
        int len = string.length();
        for(int x = 0; x < len; x++){
            char c = (char)(string.charAt(x) - 3);
            if (c > 'z')
                s += (char)(string.charAt(x) + (26+3));
            else
                s += (char)(string.charAt(x) - 3);
        }
        return s;
    }


    @Override
    public String decode(String string) {
        String s = "";
        int length = string.length();

        for(int i = 0; i < length ; i++){
            char c = (char) (string.charAt(i) + 3);

            if(c > 'a')
                s += (char) (string.charAt(i) - (26+3));
                //als de waarde van het getal plus 3 hoger is dan 'z' terug beginnen

            else
                s += (char) (string.charAt(i) + 3);
        }
        return s;
    }
}
