package praktikum_5.latihan;

public class TaxCalculator {
    public double calculateTax(String vehicleType, double price) {
        if (vehicleType.equals("Car")) {
            return price * 0.1; // Pajak 10% untuk mobil
        } else if (vehicleType.equals("Motorcycle")) {
            return price * 0.05; // Pajak 5% untuk motor
        } else {
            return 0;
        }
    }
}