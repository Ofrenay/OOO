package domain;

import java.util.*;

public class Bank implements Subject {
    private Map<Integer,Rekening> rekeningMap;
    private Map<BankEvent, List<Observer>> observers;

    public Bank(){
        rekeningMap = new HashMap<>();
        observers = new HashMap<>();
    }

    public void addRekening(Rekening rekening){
        rekeningMap.put(rekening.getNummer(),rekening);
        notifyObservers(rekening,BankEvent.NIEUWEREKENING);
    }

    public void stort(int rekeningnmr, double monies){
        Rekening rekening = rekeningMap.get(rekeningnmr);
        rekening.stort(monies);
        notifyObservers(rekening,BankEvent.STORT);
    }

    public void haalAf(int rekeningnmr, double monies){
        Rekening rekening = rekeningMap.get(rekeningnmr);
        rekening.haalAf(monies);
        notifyObservers(rekening,BankEvent.HAALAF);
    }

    public ArrayList<Rekening> getAll() {
        ArrayList<Rekening> rekeningen = new ArrayList<Rekening>();
        for(int nummer:rekeningMap.keySet()){
            rekeningen.add(this.rekeningMap.get(nummer));
        }
        return rekeningen;
    }

    @Override
    public void addObserver(Observer o, BankEvent bankEvent) {
        List<Observer> obs = observers.get(bankEvent);
        if(obs == null  || obs.isEmpty()){
            obs = new LinkedList<>();
            observers.put(bankEvent,obs);
        }
        obs.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(Rekening rekening, BankEvent bankEvent) {
        for(Observer o:observers.get(bankEvent)){
            o.update(rekening);
        }
    }
}
