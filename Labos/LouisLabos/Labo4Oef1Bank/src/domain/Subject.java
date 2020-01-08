package domain;

import java.util.List;

public interface Subject {

    void addObserver(Observer o, BankEvent bankEvent);

    void removeObserver(Observer o);


    void notifyObservers(Rekening rekening, BankEvent bankEvent);
}
