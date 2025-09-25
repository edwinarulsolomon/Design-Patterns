package ProxyPattern;

public class RealBankAccount implements BankAccount{
    private static double balance=100000;
    @Override
    public void withdraw(String name, String role, double amount) {
        if(balance>=amount)
        {
            balance=balance-amount;
            System.out.println("Dear "+name + ", sum of "+amount+" has been withdrawn from your account \nNew Balance :"+(balance));
        }
        else
        {
            System.out.println("Insufficient Balance !!!");
        }
    }
}
