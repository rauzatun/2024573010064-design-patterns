
package modul_2.latihan.latihan_5;

public class Barang {
    String namaBarang;
    double harga;

    // Default Constructor
    public Barang() {
        this.namaBarang = "Tanpa Nama";
        this.harga = 0;
    }

    // Parameterized Constructor
    public Barang(String nama, double harga) {
        this.namaBarang = nama;
        this.harga = harga;
    }
}