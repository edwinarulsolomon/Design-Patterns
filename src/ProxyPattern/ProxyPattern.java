package ProxyPattern;


public class ProxyPattern {
    public static void main(String [] args)
    {
    BankAccount bankAccount=new BankProxy();
    bankAccount.withdraw("Edwin","admin",25000);
    bankAccount.withdraw("Density","student",25000);
    }
}
