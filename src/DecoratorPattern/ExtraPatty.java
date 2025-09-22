package DecoratorPattern;

public class ExtraPatty extends BurgerDecorator{
    ExtraPatty(Burger burger) {
        super(burger);
    }

    @Override
    public String name() {
        return super.name() + " + Extra Patty";
    }

    @Override
    public double price() {
        return super.price()+75.00;
    }
}
