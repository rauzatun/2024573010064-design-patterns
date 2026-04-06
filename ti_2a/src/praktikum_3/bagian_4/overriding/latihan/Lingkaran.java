package praktikum_3.bagian_4.overriding.latihan;


public class Lingkaran extends Bangundatar {
    double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * r * r;
    }
}