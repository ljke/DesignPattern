package Proxy;

public class StaticProxy implements Sell {
    private Sell vendor;
    private Advice advice;

    public StaticProxy(Sell vendor, Advice advice) {
        this.vendor = vendor;
        this.advice = advice;
    }

    @Override
    public void sell() {
        advice.beforeMethod();
        vendor.sell();
        advice.afterMethod();
    }
}
