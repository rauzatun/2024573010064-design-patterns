package praktikum_2.bagian_4.overriding;

public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing(); // polymorphism
        Hewan hewan2 = new Anjing(); // polymorphism

       hewan1.bersuara(); // output: Meong!
        hewan2.bersuara(); // output: Guk Guk!

    }
}
