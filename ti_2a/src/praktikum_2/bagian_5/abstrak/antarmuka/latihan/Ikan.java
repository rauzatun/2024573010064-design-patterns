package praktikum_2.bagian_5.abstrak.antarmuka.latihan;

import praktikum_2.bagian_5.abstrak.latihan.Hewanair;

public class Ikan extends Hewanair implements Berenang {

    public Ikan(String nama) {
        super(nama);
    }

    @Override
    public void berenang() {
        System.out.println(nama + " berenang");
    }

    @Override
    public void makan() {
        System.out.println(nama + " makan");
    }
}