package praktikum_9.latihan;

public class BankTransferPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Membayar sebesar Rp" + amount + " melalui Transfer Bank.");
    }
}