package DecoratorPattern;

public class DecoratorPattern {
    public static void main(String [] args)
    {
        Burger burger=new NonVegBurger();

        System.out.println(burger.name());
        System.out.println("Price :"+burger.price());

        burger=new ExtraCheese(burger);

        System.out.println(burger.name());
        System.out.println("Price :"+burger.price());

        burger=new ExtraPatty(burger);

        System.out.println(burger.name());
        System.out.println("Price :"+burger.price());

    }
}
