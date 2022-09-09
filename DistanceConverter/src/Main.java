import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            double kilometers;
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Please input the Distance in kilometers: ");
          kilometers = inputScanner.nextDouble();
            double mile = 1.6;
            double total = kilometers/mile;
        System.out.println("The distance in miles is... " + total);
    }
}