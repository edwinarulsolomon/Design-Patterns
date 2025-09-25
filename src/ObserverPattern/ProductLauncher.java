package ObserverPattern;

public interface ProductLauncher {
    void subscribe(Customer customer);
    void unsubscribe(Customer customer);
    void notifyCustomer();
}
