package model;

public class CashPayment extends Payment {

    public CashPayment(String paymentId) {
        super(paymentId);
    }

    @Override
    public void makePayment(double amount) {

        System.out.println("\n===== CASH ON DELIVERY =====");
        System.out.println("Payment ID : " + getPaymentId());
        System.out.println("Amount     : ₹" + amount);
        System.out.println("Payment Mode : Cash on Delivery");
        System.out.println("Please pay the delivery partner upon delivery.");
    }
}