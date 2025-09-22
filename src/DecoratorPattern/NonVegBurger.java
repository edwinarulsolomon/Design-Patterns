package DecoratorPattern;

public class NonVegBurger implements Burger{

    @Override
    public String name() {
        return "Non-Veg Burger";
    }

    @Override
    public double price() {
        return 150.00;
    }
}
