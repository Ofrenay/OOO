package Domain;

import ui.view.Observer;
import ui.view.Subject;

import java.util.ArrayList;

public class PlayerData implements Subject {
    ArrayList<Integer> scores;
    ArrayList<Observer> observers;

    public void addScore(int spelerNummer, int score){
        if(scores.size() == 0 || scores.get(spelerNummer -1) == null)
            scores.add(spelerNummer -1, score);

        else
            scores.set(spelerNummer -1, score);

        notifyObservers();
    }

    public PlayerData(){
        scores = new ArrayList<>();
        observers = new ArrayList<>();
    }

    @Override
    public void registerObservers(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObservers(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observers){
            o.update(scores);
        }
    }
}
