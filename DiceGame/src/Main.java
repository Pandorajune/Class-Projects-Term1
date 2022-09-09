import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int diceAmount;
        int diceOne;
        int diceTwo;
        int diceThree;


        Scanner inputScanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        System.out.println("Enter number of dice to throw");
        diceAmount = inputScanner.nextInt();

        System.out.println("You choose to throw " + diceAmount + " dice" );

        diceOne = randomGenerator.nextInt(6)+1;
        diceTwo = randomGenerator.nextInt(6)+1;
        diceThree = randomGenerator.nextInt(6)+1;



        if (diceAmount == 1){
            System.out.println("Dice one: " + diceOne);
        }else if(diceAmount == 2){
            System.out.println("Dice one: " + diceOne + " Dice two: " + diceTwo);
        }else if(diceAmount == 3){
            System.out.println("Dice one: " + diceOne + " Dice two: " + diceTwo + " Dice Three: " +diceThree);
        }else{
            System.out.println("Sorry you can only choose up to three dice");
        }



    }
}