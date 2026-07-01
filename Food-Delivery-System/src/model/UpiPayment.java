package model;

public class UpiPayment extends Payment {
    private String upiId;

    public UpiPayment(String paymentId, String upiId) {
        super(paymentId);
        this.upiId = upiId;
    }

    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void makePayment(double amount) {

        System.out.println("\n===== UPI PAYMENT =====");
        System.out.println("Payment ID : " + getPaymentId());
        System.out.println("UPI ID     : " + upiId);
        System.out.println("Amount     : ₹" + amount);
        System.out.println("Payment Successful via UPI.");
    }
}