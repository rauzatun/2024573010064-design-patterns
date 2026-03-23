package praktikum_2.bagian_2.latihan;

public class Main {
    public static void main(String[] args) {

        Motor m = new Motor();
        m.setMerk("Yamaha");
        m.setTahun(2023);

        System.out.println(m.getMerk());
        System.out.println(m.getTahun());

    }
}