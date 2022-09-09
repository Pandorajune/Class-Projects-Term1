import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int guess;
       int randomOne;
       int randomTwo;
       int answer;

        Scanner inputScanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        randomOne = randomGenerator.nextInt(100) + 1;
        randomTwo = randomGenerator.nextInt(100) + 1;
        System.out.println("Here are your numbers...");
        System.out.println("First Number: " + randomOne + " Second Number: " + randomTwo);
        System.out.println("Please enter the sum of the numbers: ");
        answer = randomOne + randomTwo;
        guess = inputScanner.nextInt();
        if(guess == answer){
            System.out.println("Correct!!");
        }else{
            System.out.println("Wrong answer... the right answer was: " + answer);
        }



    }
}