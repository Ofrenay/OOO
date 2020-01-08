package domain;

public class DobbelSteen {

    public DobbelSteen(){
    }

    public int eenDobbelSteen(){
        return (int) (Math.random() * 6) + 1;
    }

    public int gooi(){
        int eerstegooi =  eenDobbelSteen();
        int tweedegooi = eenDobbelSteen();
        int tot = eerstegooi + tweedegooi;

        if(eerstegooi == tweedegooi){
            tot = tot*2;
        }

        return tot;

    }


}
