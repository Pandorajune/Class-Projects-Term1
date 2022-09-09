import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fahrenheit;
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please input temperature in Fahrenheit: ");
        fahrenheit = inputScanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is... " + celsius);


    }
}