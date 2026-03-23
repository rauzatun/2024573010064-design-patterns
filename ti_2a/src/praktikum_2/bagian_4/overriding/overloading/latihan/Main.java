package praktikum_2.bagian_4.overriding.overloading.latihan;

public class Main {
    public static void main(String[] args) {

        Matematika m = new Matematika();

        System.out.println(m.tambah(2, 3));
        System.out.println(m.tambah(2, 3, 4));
        System.out.println(m.tambah(2.5, 3.5));

    }
}