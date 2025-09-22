package DecoratorPattern;

public class ExtraCheese extends BurgerDecorator{
    ExtraCheese(Burger burger) {
        super(burger);
    }
    public String name()
    {
        return burger.name()+" + Extra Cheese ";
    }

    @Override
    public double price() {
        return super.price() + 15.00;
    }
}
