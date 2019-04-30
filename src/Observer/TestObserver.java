package Observer;

public class TestObserver {
    public static void main(String[] args){
        Subject subject = new ConcreteSubject();
        for (int i = 0; i < 5; i++) {
            Observer observer = new ConcreteObserver(i);
            subject.attach(observer);
        }
        subject.changeState("Runnable");
        subject.changeState("Stopped");
    }
}
