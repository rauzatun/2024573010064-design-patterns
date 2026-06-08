package praktikum_9.latihan;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Membayar sebesar Rp" + amount + " menggunakan Kartu Kredit.");
    }
}