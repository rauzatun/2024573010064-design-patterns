package praktikum_9.bagian_1;

// Strategy
public class DrivingRoute implements RouteStrategy {
    public void buildRoute(String from, String to) {
        System.out.println("Membuat rute berkendara dari " + from + " ke " + to);
    }
}