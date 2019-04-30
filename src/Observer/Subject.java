package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> list = new ArrayList<Observer>();
    private String state;

    public void attach(Observer observer) {
        list.add(observer);
        System.out.println("Attach an observer");
    }

    public void detach(Observer observer) {
        list.remove(observer);
        System.out.println("Detach an observer");
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public abstract void changeState(String state);

    public void notifyObservers(Subject subject) {
        for (Observer observer : list) {
            observer.update(subject);
        }
    }
}
