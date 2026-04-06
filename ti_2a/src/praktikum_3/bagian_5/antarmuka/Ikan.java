package praktikum_3.bagian_5.antarmuka;

import praktikum_3.bagian_5.abstrak.HewanAir;

public class Ikan extends HewanAir implements Bergerak {

    public Ikan(String nama) {
        super(nama);
    }

    @Override
    public void makan() {
        System.out.println(nama + " makan");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak");
    }
}