package praktikum_3.bagian_3.komposisi;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil
        // Saat objek mobil dibuat, objek Mesin di dalamnya juga ikut dibuat (Komposisi)
        Mobil mobilku = new Mobil();

        System.out.println("--- Memulai Perjalanan ---");
        mobilku.mulai();

        System.out.println("\n--- Mengakhiri Perjalanan ---");
        mobilku.berhenti();
    }
}