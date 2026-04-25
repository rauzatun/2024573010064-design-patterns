package praktikum_5.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vehicle type (Car/Motorcycle): ");
        String type = scanner.next();
        System.out.print("Enter vehicle price: ");
        double price = scanner.nextDouble();

        TaxCalculator calculator = new TaxCalculator();
        double tax = calculator.calculateTax(type, price);

        System.out.println("Calculated tax: " + tax);
    }
}