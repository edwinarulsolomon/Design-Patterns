package FactoryPattern;

public class MobileBanking implements Payment{
    String senderName;
    String accountNumber;
    String receiverName;
    double amount;
    boolean status=false;

    public MobileBanking(String senderName, String accountNumber, String receiverName, double amount, boolean status) {
        this.senderName = senderName;
        this.accountNumber = accountNumber;
        this.receiverName = receiverName;
        this.amount = amount;
        this.status = status;
    }

    @Override
    public void getBill() {
        System.out.println("------------------------------");
        System.out.println("    BILL FOR THE PAYMENT ");
        System.out.println("------------------------------");
        System.out.println("Sender Name :"+senderName);
        System.out.println("Receiver Name :"+receiverName);
        System.out.println("Account Number :"+accountNumber);
        System.out.println("Total Amount :"+amount);
    }

    @Override
    public void paymentStatus() {
        System.out.println("--------------------------------------");
        System.out.println("    PAYMENT STATUS FOR MOBILE BANKING");
        System.out.println("-------------------------------------");
        if(status)
        {
           System.out.println("Your Payment has been Sucessfully completed !!!");
        }
        else {
            System.out.println(" OOPS Your Payment failed !");
        }
    }
}
