package praktikum_9.latihan;

public class Main {
    public static void main(String[] args) {
        Checkout keranjang = new Checkout();
        double totalBelanja = 150000.0;

        System.out.println("--- Simulasi Pembayaran E-Commerce ---");

        // 1. Menggunakan Kartu Kredit
        keranjang.setPaymentStrategy(new CreditCardPayment());
        keranjang.processPayment(totalBelanja);

        // 2. Menggunakan E-Wallet
        keranjang.setPaymentStrategy(new EWalletPayment());
        keranjang.processPayment(totalBelanja);

        // 3. Menggunakan Transfer Bank
        keranjang.setPaymentStrategy(new BankTransferPayment());
        keranjang.processPayment(totalBelanja);
    }
}