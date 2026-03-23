package praktikum_2.bagian_4.overriding.latihan;


public class Persegi extends Bangundatar {
    double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
}