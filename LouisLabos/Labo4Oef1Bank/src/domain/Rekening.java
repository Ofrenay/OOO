package domain;

public class Rekening {

    private int nummer;
    private double saldo;

    public Rekening(int nummer, double saldo){
        this.nummer = nummer;
        this.saldo = saldo;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void stort(double monies){
        saldo += monies;
    }

    public void haalAf(double monies){
        saldo -= monies;
    }

    @Override
    public String toString() {
        return nummer + " : " +  saldo + " euro";
    }
}
