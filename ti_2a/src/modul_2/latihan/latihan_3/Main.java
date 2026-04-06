
package modul_2.latihan.latihan_3;

public class Main {
    public static void main(String[] args) {
        AkunBank akun = new AkunBank();
        akun.tampilkanSaldo();

        // System.out.println(akun.saldo);
        // Apa yang terjadi? Error: saldo has private access in AkunBank
    }
}