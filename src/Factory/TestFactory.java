package Factory;

public class TestFactory {
    public static void testProduct(Product product) {
        if (product != null) {
            product.methodSame();
            product.methodDiff();
        }
    }

    public static void main(String[] args) {
        Product product;
        System.out.println("--Static Factory--");
        product = StaticFactory.getProduct("a");
        testProduct(product);
        product = StaticFactory.getProduct("b");
        testProduct(product);

        System.out.println("--Factory Method--");
        Factory factory = new ConcreteFactoryA();
        product = factory.getProduct();
        testProduct(product);
        factory = new ConcreteFactoryB();
        product = factory.getProduct();
        testProduct(product);

        System.out.println("--Abstract Factory--");
        AbstractFactory abstractFactory = new AbstractFactoryImpl();
        product = abstractFactory.getProductA();
        testProduct(product);
        product = abstractFactory.getProductB();
        testProduct(product);
    }
}
