import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a speed:");
        int speedTraveled;
        speedTraveled = input.nextInt();

        System.out.println("Please enter a distance to travel");
        double distanceTraveled;
        distanceTraveled = input.nextDouble();

        double time = distanceTraveled / speedTraveled;
        double y = time * 60;
        double hours = y / 60;
        double minutes = y % 60;

        System.out.printf("Total time traveled is %.0f hours and %.0f minutes", hours, minutes);





    }
}