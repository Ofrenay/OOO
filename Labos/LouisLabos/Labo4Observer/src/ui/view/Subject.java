package ui.view;

import ui.view.Observer;

import java.util.List;

public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
