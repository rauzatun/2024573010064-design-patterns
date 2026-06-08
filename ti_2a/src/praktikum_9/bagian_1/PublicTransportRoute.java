package praktikum_9.bagian_1;

// Strategy
public class PublicTransportRoute implements RouteStrategy {
    public void buildRoute(String from, String to) {
        System.out.println("Membuat rute transportasi umum dari " + from + " ke " + to);
    }
}