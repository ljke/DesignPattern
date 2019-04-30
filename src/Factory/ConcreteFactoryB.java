package Factory;

public class ConcreteFactoryB extends Factory {
    @Override
    public Product getProduct() {
        return new ConcreteProductB();
    }
}
