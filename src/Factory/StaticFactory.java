package Factory;

/**
 * 简单工厂模式，不属于23种设计模式之一，只是一种方法
 */
public class StaticFactory {
    public static Product getProduct(String arg){
        Product product = null;
        switch (arg.toLowerCase()){
            case "a":
                product = new ConcreteProductA();
                break;
            case "b":
                product = new ConcreteProductB();
                break;
            default:
                System.out.println("No suitable product");
        }
        return product;
    }
}
