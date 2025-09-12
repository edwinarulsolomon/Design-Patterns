package FactoryPattern;

import java.util.Scanner;

public class PaymentFactory {
    static Scanner sc=new Scanner(System.in);
    public static Payment getPayment(String payment)
    {
        if(payment.equalsIgnoreCase("UPI"))
        {
            System.out.println("Enter your Name :");
            String senderName=sc.nextLine();
            System.out.println("Enter Receiver Name :");
            String receiverName=sc.nextLine();
            System.out.println("Enter Amount to be send :");
            double amount=sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter UPI id :");
            String UPI=sc.nextLine();
            System.out.println("Are you sure to make Payment ( YES or NO ) :");
            String ans=sc.nextLine();
            boolean status=false;
            if(ans.equalsIgnoreCase("YES")) status=true;

            return new UPI(senderName,UPI,receiverName,amount,status);
        }
        else if(payment.equalsIgnoreCase("MobileBanking")){
            System.out.println("Enter your Name :");
            String senderName=sc.nextLine();
            System.out.println("Enter Receiver Name :");
            String receiverName=sc.nextLine();
            System.out.println("Enter Amount to be send :");
            double amount=sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter Account Number :");
            String account=sc.nextLine();
            System.out.println("Are you sure to make Payment ( YES or NO ) :");
            String ans=sc.nextLine();
            boolean status=false;
            if(ans.equalsIgnoreCase("YES")) status=true;

            return new MobileBanking(senderName,account,receiverName,amount,status);
        }
        else {
            return null;
        }
    }
}
