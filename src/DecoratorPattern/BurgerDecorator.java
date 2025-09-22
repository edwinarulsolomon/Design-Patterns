package DecoratorPattern;

public abstract class BurgerDecorator implements Burger{
    protected Burger burger;
    BurgerDecorator(Burger burger)
    {
        this.burger=burger;
    }
    public String name()
    {
        return burger.name();
    }
    public double price()
    {
        return burger.price();
    }
}
