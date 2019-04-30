package Proxy;

public class Vendor implements Sell {
    @Override
    public void sell() {
        System.out.println("Vendor sell");
    }
}
