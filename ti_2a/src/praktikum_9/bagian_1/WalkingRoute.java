package praktikum_9.bagian_1;


// Strategy
public class WalkingRoute implements RouteStrategy {
    public void buildRoute(String from, String to) {
        System.out.println("Membuat rute jalan kaki dari " + from + " ke " + to);
    }
}