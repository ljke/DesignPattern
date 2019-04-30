package Observer;

public class ConcreteSubject extends Subject {

    public void changeState(String state) {
        setState(state);
        System.out.println("Subject State:" + getState());
        notifyObservers(this);
    }
}
