import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pounds;
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter your weight in pounds: ");
        pounds = inputScanner.nextDouble();
        double kilograms = pounds / 2.2046;
        System.out.println("Your weight in kilograms is... " + kilograms);
    }
}