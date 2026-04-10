package praktikum_2.bagian_2;

public class Main {
    public static void main(String[] args) {
        Kalkulator Kalkulator = new Kalkulator();
        Kalkulator.angka1 = 5;
        Kalkulator.angka2 = 10;

        System.out.println("Hasil penjumlahan: " + Kalkulator.tambah());
    }
}
