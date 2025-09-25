package ProxyPattern;

public class BankProxy implements BankAccount{
    BankAccount bankAccount=new RealBankAccount();
    @Override
    public void withdraw(String name, String role, double amount) {
        if("admin".equals(role))
        {
            bankAccount.withdraw(name,role,amount);
        }
        else System.out.println("Sorry ! Access Denied for the user : "+name);
    }
}
