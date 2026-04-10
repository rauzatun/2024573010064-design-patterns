package praktikum_3.bagian_3.komposisi.latihan;

public class Laptop {

    Processor processor = new Processor();
    RAM ram = new RAM();

    void nyalakanLaptop() {
        System.out.println("Laptop dinyalakan.");
        processor.jalankan();
        ram.baca();
        ram.tulis();
    }
}