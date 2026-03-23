package praktikum_2.bagian_5.antarmuka;

public interface Bergerak {
    void bergerak(); // method abstract

    default void berhenti() { // method default
        System.out.println("Berhenti...");
    }

    static void info() { // method static
        System.out.println("Interface Bergerak");
    }
}