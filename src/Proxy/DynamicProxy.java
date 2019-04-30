package Proxy;

import java.lang.reflect.Proxy;

public class DynamicProxy implements Sell {
    private Sell sell;

    public DynamicProxy(Object target, Advice advice) {
        sell = (Sell) getProxy(target, advice);
    }

    private Object getProxy(Object target, Advice advice) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), (proxy1, method, args) -> {
                    advice.beforeMethod();
                    Object retVal = method.invoke(target, args);
                    advice.afterMethod();
                    return retVal;
                });
    }

    @Override
    public void sell() {
        sell.sell();
    }
}
