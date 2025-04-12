import model.Payment;
import service.PaymentService;
import util.CurrencyFormatter;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        Payment siti = new Payment(3_500_000, "Kartu Kredit");
        System.out.println("=== Transaksi Siti ===");
        System.out.println("Total Sebelum Diskon: " + CurrencyFormatter.format(siti.getTotalPrice()));
        service.processPayment(siti);
        service.printPaymentDetail(siti);
        System.out.println("Total Setelah Diskon: " + CurrencyFormatter.format(siti.getTotalPrice()));
        System.out.println();

        Payment ciciripi = new Payment(10_000_000, "Voucher Diskon");
        System.out.println("=== Transaksi Ciciripi ===");
        System.out.println("Total Sebelum Diskon: " + CurrencyFormatter.format(ciciripi.getTotalPrice()));
        service.processPaymentWithVoucher(ciciripi, 15);
        service.printPaymentDetail(ciciripi);
        System.out.println("Total Setelah Diskon: " + CurrencyFormatter.format(ciciripi.getTotalPrice()));
        System.out.println();

        Payment asnawi = new Payment(1_200_000, "Transfer Bank");
        System.out.println("=== Transaksi Asnawi ===");
        System.out.println("Total Sebelum Diskon: " + CurrencyFormatter.format(asnawi.getTotalPrice()));
        service.processPayment(asnawi);
        service.printPaymentDetail(asnawi);
        System.out.println("Total Setelah Diskon: " + CurrencyFormatter.format(asnawi.getTotalPrice()));
        System.out.println();
    }
}