import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner indexScan = new Scanner(System.in);
        Random randomGen = new Random();

        int rand;
        rand = randomGen.nextInt(3);
        System.out.println(rand);
        boolean quit = false;
        int numberOne;
        numberOne = randomGen.nextInt(100);
        int numberTwo;
        numberTwo = randomGen.nextInt(100);
        int guessOne;
        int guessTwo = 0;
        String userInput;

        while (!quit) {

            switch (rand) {
                case 0:
                    System.out.println("Here is your equation " + numberOne + "+" + numberTwo);
                    System.out.println("What is your Answer?");
                    guessOne = indexScan.nextInt();
                    if(guessOne != numberOne + numberTwo){
                        System.out.println("Wrong answer try again");
                        guessTwo = indexScan.nextInt();
                    }else if(guessTwo != numberOne + numberTwo){
                        System.out.println(numberOne + numberTwo);
                        System.out.println("Do you want to play again(y) or quit(q)?");
                        userInput =indexScan.next();
                        if( userInput.contains("q")){
                            quit = true;
                        }else if(userInput.contains("y")){
                            quit= false;
                        }
                    }
                    quit = true;
                case 1:
                    System.out.println("Here is your equation " + numberOne + "-" + numberTwo);
                    System.out.println("What is your Answer?");
                    guessOne = indexScan.nextInt();
                    quit = true;
                case 2:
                    System.out.println("Here is your equation " + numberOne + "*" + numberTwo);
                    System.out.println("What is your Answer?");
                    guessOne = indexScan.nextInt();
                    quit = true;

                    break;
                    
                default:
            }
        }

    }
}