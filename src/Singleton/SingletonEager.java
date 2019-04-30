package Singleton;

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        System.out.println("SingletonEager Create " + this.toString());
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
