package ObserverPattern;

public class ObserverPattern {
    public static void main(String [] args)
    {
        Customer customer=new AmazonUser("Edwin");
        Customer customer1=new AmazonUser("Density");
        Customer customer2=new AmazonUser("Ronaldo");

        ProductLauncher productLauncher=new ProductIphone("Iphone");

        productLauncher.subscribe(customer);
        productLauncher.subscribe(customer1);
        productLauncher.subscribe(customer2);
        productLauncher.unsubscribe(customer1);
        productLauncher.notifyCustomer();

        ProductLauncher productLauncher1=new ProductIphone("Iphone 18");

        productLauncher1.subscribe(customer1);
        productLauncher1.notifyCustomer();
    }
}
