package praktikum_2.bagian_3;

class Mesin {
    void hidupkan() {
        System.out.println("Mesin menyala.");
    }

    void matikan() {
        System.out.println("Mesin dimatikan.");
    }
}

class Kendaraan {
    void bergerak() {
        System.out.println("Kendaraan sedang bergerak.");
    }
}

class Mobil extends Kendaraan {

    Mesin mesin = new Mesin();

    void mulai() {
        mesin.hidupkan();
    }

    void berhenti() {
        mesin.matikan();
        System.out.println("Mobil berhenti.");
    }
}

public class Main {
    public static void main(String[] args) {

        Mobil mobil = new Mobil();

        mobil.mulai();
        mobil.bergerak();
        mobil.berhenti();
    }
}
