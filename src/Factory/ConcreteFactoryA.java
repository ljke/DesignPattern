package Factory;

public class ConcreteFactoryA extends Factory {
    @Override
    public Product getProduct() {
        return new ConcreteProductA();
    }
}
