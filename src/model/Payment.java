package model;

public class Payment {
    private double totalPrice;
    private String paymentMethod;
    private String paymentStatus;

    public Payment(double totalPrice, String paymentMethod) {
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = "";
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double price) {
        this.totalPrice = price;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String method) {
        this.paymentMethod = method;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String status) {
        this.paymentStatus = status;
    }
}
