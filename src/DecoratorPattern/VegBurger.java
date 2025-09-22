package DecoratorPattern;

public class VegBurger implements Burger{
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public double price() {
        return 100.00;
    }
}
