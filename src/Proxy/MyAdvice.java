package Proxy;

public class MyAdvice implements Advice {
    @Override
    public void beforeMethod() {
        System.out.println("Before sell");
    }

    @Override
    public void afterMethod() {
        System.out.println("After sell");
    }
}
