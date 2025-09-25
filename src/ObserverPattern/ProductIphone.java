package ObserverPattern;

import java.util.HashSet;
import java.util.List;

public class ProductIphone implements ProductLauncher{
    private HashSet<Customer> customerList=new HashSet<>();
    private String productname;
    public ProductIphone(String productname)
    {
        this.productname=productname;
    }
    @Override
    public void subscribe(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void unsubscribe(Customer customer) {
        customerList.remove(customer);
    }

    @Override
    public void notifyCustomer() {
        for(Customer customer:customerList)
        {
            customer.update(productname);
        }
    }
}
