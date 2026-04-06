
package modul_2.latihan.latihan_5;

public class Main {
    public static void main(String[] args) {
        Barang b1 = new Barang(); // Default
        Barang b2 = new Barang("Laptop", 15000000); // Parameterized

        System.out.println("B1: " + b1.namaBarang + ", Harga: " + b1.harga);
        System.out.println("B2: " + b2.namaBarang + ", Harga: " + b2.harga);
    }
}