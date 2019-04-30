package Singleton;

public class SingletonInner {
    private static class Singleton{
        private static final SingletonInner instance = new SingletonInner();
    }

    private SingletonInner(){
        System.out.println("SingletonInner Create " + this.toString());
    }

    public static SingletonInner getInstance(){
        return Singleton.instance;
    }

}
