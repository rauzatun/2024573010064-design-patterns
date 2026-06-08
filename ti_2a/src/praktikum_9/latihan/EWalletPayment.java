package praktikum_9.latihan;

public class EWalletPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Membayar sebesar Rp" + amount + " menggunakan E-Wallet.");
    }
}