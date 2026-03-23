package praktikum_2.bagian_3.pewarisan.komposisi.latihan;


public class Laptop {
    Processor processor = new Processor();
    Ram ram = new Ram();

    public void jalankanLaptop() {
        processor.jalankan();
        ram.baca();
        ram.tulis();
    }
}