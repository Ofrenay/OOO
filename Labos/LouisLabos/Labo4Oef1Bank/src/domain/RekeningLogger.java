package domain;

import java.util.ArrayList;

public class RekeningLogger implements Observer {
    private Bank bank;

    public RekeningLogger(Bank bank) {
        this.bank = bank;
        bank.addObserver(this, BankEvent.NIEUWEREKENING);
        bank.addObserver(this, BankEvent.HAALAF);
        bank.addObserver(this, BankEvent.STORT);
    }

 // smeh
    @Override
    public void update(Rekening rekening) {
        ArrayList<Rekening> rekeningen = bank.getAll();
        System.out.println( "Log voor : " + rekening.toString());
        System.out.println( "Saldo : " + rekening.getSaldo());
        System.out.println(" er zijn nu " + rekeningen.size() + " rekekningen \n");
    }

}

