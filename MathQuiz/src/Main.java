import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner indexScan = new Scanner(System.in);
        Random randomGen = new Random();

        int xNumberOne ;
        int xNumberTwo ;
        int xOperator;
        int xPlayerAnswer;
        int xCorrectAnswer ;


            xNumberOne = randomGen.nextInt(100);
            xNumberTwo = randomGen.nextInt(100);

            Random randomOperate = new Random();

            xOperator = randomOperate.nextInt(3);

            System.out.println("Welcome to Math Quiz");
            System.out.print("Here's your equation: " + xNumberOne);

            if (xOperator == 0) {
                System.out.print(" + ");
            } else if (xOperator == 1) {
                System.out.print(" - ");
            } else {
                System.out.print(" * ");
            }

            System.out.println(xNumberTwo);

            System.out.println("What is your answer: ");
            xPlayerAnswer = indexScan.nextInt();

            if (xPlayerAnswer == xNumberOne * xNumberTwo){
                System.out.println("You got it right!");
            }else if(xPlayerAnswer == xNumberOne + xNumberTwo){
                System.out.println("You got it right!");
            }else if(xPlayerAnswer == xNumberOne - xNumberTwo) {
                System.out.println("You got it right!");
            }

                if (xPlayerAnswer != xNumberOne * xNumberTwo) {
                    System.out.println("Sorry that's wrong, try again");
                } else if (xPlayerAnswer != xNumberOne + xNumberTwo) {
                    System.out.println("Sorry that's wrong, try again");
                } else if (xPlayerAnswer != xNumberOne - xNumberTwo) {
                    System.out.println("Sorry that's wrong, try again");
                }



    }
}