import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("Please enter a number between 0 and 10000");
        int numberEntered;
        numberEntered = input.nextInt();

        int ones = (((numberEntered % 1000) % 100) % 10);
        int tens = ((numberEntered % 1000) % 100) / 10;
        int hundreds = (numberEntered % 1000) / 100;
        int thousands = numberEntered / 1000;
        int sum = ones + tens + hundreds + thousands;


       // System.out.println(ones);
       // System.out.println(tens);
       // System.out.println(hundreds);
       // System.out.println(thousands);
      //  System.out.println(sum);

        System.out.print("the sum is: " + thousands + "+" + hundreds + "+" + tens + "+" + ones + "=" + sum);


    }
}