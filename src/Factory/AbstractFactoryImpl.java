package Factory;

public class AbstractFactoryImpl extends AbstractFactory {
    @Override
    public Product getProductA() {
        return new ConcreteProductA();
    }

    @Override
    public Product getProductB() {
        return new ConcreteProductB();
    }
}
