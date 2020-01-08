package domain;

import java.util.ArrayList;

public class Auditor implements Observer {

    private Bank bank;

    public Auditor(Bank bank) {
        this.bank = bank;
        bank.addObserver(this,BankEvent.NIEUWEREKENING);
    }

    @Override
    public void update(Rekening rekening) {
        ArrayList<Rekening> rekeningen = bank.getAll();
        System.out.println(" nieuwe rekeniing : " + rekening.toString());
        for(Rekening rekekning:rekeningen){
            System.out.println( " alle rekeningen : "  + rekekning.toString());
        }
    }

}
