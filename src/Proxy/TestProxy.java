package Proxy;

public class TestProxy {
    public static void main(String[] args) {
        Sell sell = new Vendor();
        Advice advice = new MyAdvice();
        System.out.println("---Origin---");
        sell.sell();

        Sell staticProxy = new StaticProxy(sell, advice);
        System.out.println("---Static Proxy---");
        staticProxy.sell();

        Sell dynamicProxy = new DynamicProxy(sell, advice);
        System.out.println("--Dynamic Proxy--");
        dynamicProxy.sell();
    }
}
