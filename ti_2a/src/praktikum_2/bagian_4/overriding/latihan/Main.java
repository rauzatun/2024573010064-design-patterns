package praktikum_2.bagian_4.overriding.latihan;

public class Main {
    public static void main(String[] args) {

        Persegi p = new Persegi(4);
        Lingkaran l = new Lingkaran(5);

        System.out.println("Luas Persegi: " + p.hitungLuas());
        System.out.println("Luas Lingkaran: " + l.hitungLuas());

    }
}