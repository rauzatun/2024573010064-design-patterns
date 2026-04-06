package praktikum_3.bagian_3.pewarisan.komposisi;

class Mobil {
    private final Mesin mesin; // composition

    public Mobil() {
        this.mesin = new Mesin(); // membuat objek mesin
    }
     void mulai() {
        mesin.hidupkan();
         System.out.println("mobil siap digunakan.");
     }
    void berhenti() {
        mesin.matikan();
        System.out.println("mobil berhenti.");
    }
}
