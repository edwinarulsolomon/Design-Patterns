package ObserverPattern;

public class AmazonUser implements Customer{
    private String username;
    public AmazonUser(String username)
    {
        this.username=username;
    }
    @Override
    public void update(String productname) {
        System.out.println(username+"!!! Your requested product "+productname+" is on LIVE in Amazon !!!");
    }
}
