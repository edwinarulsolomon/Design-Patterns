package FactoryPattern;

public class UPI implements Payment{
    String senderName;
    String upiNumber;
    String receiverName;
    double amount;
    boolean status=false;

    public UPI(String senderName, String upiNumber, String receiverName, double amount, boolean status) {
        this.senderName = senderName;
        this.upiNumber = upiNumber;
        this.receiverName = receiverName;
        this.amount = amount;
        this.status = status;
    }

    @Override
    public void getBill() {
        System.out.println("------------------------------");
        System.out.println("    BILL FOR THE UPI PAYMENT ");
        System.out.println("------------------------------");
        System.out.println("Sender Name :"+senderName);
        System.out.println("Receiver Name :"+receiverName);
        System.out.println("UPI Number :"+upiNumber);
        System.out.println("Total Amount :"+amount);
    }

    @Override
    public void paymentStatus() {
        System.out.println("------------------------------");
        System.out.println("    PAYMENT STATUS FOR UPI ");
        System.out.println("------------------------------");
        if(status)
        {
            System.out.println("Your Payment has been Sucessfully completed !!!");
        }
        else {
            System.out.println(" OOPS Your Payment failed !");
        }
    }
}
