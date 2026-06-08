package praktikum_9.latihan;

public class Checkout {
    private PaymentStrategy paymentStrategy;

    // Mengatur strategi pembayaran secara dinamis
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Silakan pilih metode pembayaran terlebih dahulu!");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}