package Observer;

public class ConcreteObserver implements Observer {
    private String observerState;
    private int id;

    public ConcreteObserver(int id) {
        this.id = id;
    }

    @Override
    public void update(Subject subject) {
        observerState = subject.getState();
        System.out.printf("Observer %d State: %s\n", id, observerState);
    }
}
