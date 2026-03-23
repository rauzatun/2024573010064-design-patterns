
package praktikum_2.bagian_5.antarmuka;

import praktikum_2.bagian_5.abstrak.HewanAir;

public class Main {
    public static void main(String[] args) {

        // Tes interface Bergerak
        Bergerak mobil = new Mobil();
        mobil.bergerak();
        mobil.berhenti();

        Bergerak pesawat = new Pesawat();
        pesawat.bergerak();
        pesawat.berhenti();

        Bergerak.info();

        System.out.println("----------------");

        // Tes abstract class + interface
        Ikan ikan = new Ikan("Ikan Nila");
        ikan.bergerak();
        ikan.makan();
    }
}