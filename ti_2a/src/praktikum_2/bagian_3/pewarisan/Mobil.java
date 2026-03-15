package praktikum_2.bagian_3.pewarisan;

class Mobil extends Kendaraan {
    int jumlahpintu;

    void displayinfomobil() {
        displayinfomobil(); // memanggil metode dari superclass
        System.out.println("jumlah pintu: " + jumlahpintu);

    }
}
