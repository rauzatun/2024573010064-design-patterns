package praktikum_9.bagian_3;

public class EmailNotification implements NotificationStrategy {
    public void send(String message) {
        System.out.println("Mengirim email: " + message);
    }
}