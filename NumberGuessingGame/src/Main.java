import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userGuess;
        int correctAnswer;
        int upperBoundry;
        int lowerBoundry;
        int randomPosition;
        Scanner inputScanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        correctAnswer = randomGenerator.nextInt(100) + 1;
        //System.out.println(correctAnswer);
        randomPosition = randomGenerator.nextInt(6) + 1;
        lowerBoundry = correctAnswer - randomPosition;
        upperBoundry = correctAnswer + (6 - randomPosition);
        //System.out.println("random postion: " + randomPosition);
        //System.out.println("lower boundry: " + lowerBoundry + "  upper boundry: " + upperBoundry);
        if(upperBoundry > 100){
            lowerBoundry = 94;
            upperBoundry = 100;
        }
        if(lowerBoundry < 0){
            lowerBoundry = 0;
            upperBoundry = 6;
        }
        System.out.println("please guess a whole number between " + lowerBoundry + " and " + upperBoundry);
        userGuess = inputScanner.nextInt();
        if(userGuess == correctAnswer){
            System.out.println("Correct!!! Well Done!");
        }else{
            System.out.println("Sorry, wrong answer. the correct answer is: " + correctAnswer);
        }



    }
}