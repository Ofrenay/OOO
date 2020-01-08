package launcher;

import domain.Auditor;
import domain.Bank;
import domain.Rekening;
import domain.RekeningLogger;

public class Launcher {

    public static void main(String[] args) {

        Bank yeet = new Bank();
        Auditor auditor = new Auditor(yeet);
        RekeningLogger rekeningLogger = new RekeningLogger(yeet);
        Rekening rekekning = new Rekening(69,420);
        yeet.addRekening(rekekning);
        yeet.stort(69,100000000);
        rekekning.getSaldo();

    }

}
