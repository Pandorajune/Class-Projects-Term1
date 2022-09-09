import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
           Scanner input  = new Scanner(System.in);
           DecimalFormat formatter = new DecimalFormat("0.00");

           System.out.println("Please enter total cost of Purchased items");
           double totalCost;
           totalCost = input.nextDouble();
           double salesTaxRate = totalCost / 100 * 6.5;
           double totalAmount;
           totalAmount = totalCost + salesTaxRate ;
           System.out.printf("Total Cost is $%.2f\n", totalAmount);
    }
}