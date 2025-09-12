package FactoryPattern;

public class FactoryPattern {
    public static void main(String [] args) {
        Payment payment = PaymentFactory.getPayment("UPI");
        payment.getBill();
        payment.paymentStatus();

        Payment payment1 = PaymentFactory.getPayment("mobilebanking");
        payment1.getBill();
        payment1.paymentStatus();
    }
}
