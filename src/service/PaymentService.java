package service;

import model.Payment;

public class PaymentService {

    public void processPayment(Payment payment) {
        payment.setPaymentStatus("Pembayaran Berhasil dengan " + payment.getPaymentMethod());
    }

    public void processPaymentWithVoucher(Payment payment, double discountPercentage) {
        double discount = payment.getTotalPrice() * (discountPercentage / 100);
        payment.setTotalPrice(payment.getTotalPrice() - discount);
        payment.setPaymentStatus("Pembayaran Berhasil dengan " + payment.getPaymentMethod());
    }

    public void printPaymentDetail(Payment payment) {
        System.out.println("Metode Pembayaran: " + payment.getPaymentMethod());
        System.out.println("Status Pembayaran: " + payment.getPaymentStatus());
    }
}
