package Domain;

public class Rekening {
    private double saldo;
    private String rekeningNummer;

    public Rekening(String rekeningNummer, double saldo){
        this.rekeningNummer = rekeningNummer;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getRekeningNummer() {
        return rekeningNummer;
    }

    public void setRekeningNummer(String rekeningNummer) {
        this.rekeningNummer = rekeningNummer;
    }
}
