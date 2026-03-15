// Interface
interface Bergerak {
    // Method abstrak
    void Bergerak();

    // Method default (Java 8+)
    default void Berhenti() {
        System.out.println("Berhenti bergerak.");
    }

    // Method static (Java 8+)
    static void info() {
        System.out.println("Ini adalah interface Bergerak.");
    }
}