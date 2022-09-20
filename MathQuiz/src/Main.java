import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner indexScan = new Scanner(System.in);
        Random randomGen = new Random();

        int rand;
        int guessOne = 0;
        int guessTwo = 0;
        String userInput;
        int guess = guessOne & guessTwo;
        boolean quit = false;

        while (!quit) {

            //rand = randomGen.nextInt(3);
            rand = 0; //test
            int numberOne;
            numberOne = randomGen.nextInt(100);
            int numberTwo;
            numberTwo = randomGen.nextInt(100);

            switch (rand) {


                case 0:
                    System.out.println("Here is your equation " + numberOne + "+" + numberTwo);
                    System.out.println("What is your Answer?");
                    guessOne = indexScan.nextInt();
                    if(guessOne != (numberOne + numberTwo)){
                        System.out.println("Wrong answer try again");
                        guessTwo = indexScan.nextInt();
                    }else if(guessTwo != (numberOne + numberTwo)){
                        System.out.println("the correct answer is: " + (numberOne + numberTwo));
                        System.out.println("Do you want to play again(y) or quit(q)?");
                        userInput = indexScan.next();
                        if( userInput.contains("q")){
                            quit = true;
                        }else if(userInput.contains("y")){
                            quit= false;
                        }
                    }else if(guess == guessOne + guessTwo){
                        System.out.println("Good Job!");
                        System.out.println("Do you want to play again(y) or quit(q)?");
                        userInput = indexScan.next();
                        if( userInput.contains("q")){
                            quit = true;
                        }else if(userInput.contains("y")){
                            quit= false;
                        }
                    }

                    /**
                     *  Case 0 won't quit
                     *  skipping over lines 33-35 in all cases
                     *  the other cases quits work but are the same as 0
                     */

                case 1:
                    System.out.println("Here is your equation " + numberOne + "-" + numberTwo);
                    System.out.println("What is your Answer?");
                    guessOne = indexScan.nextInt();
                    if(guessOne != numberOne - numberTwo){
                        System.out.println("Wrong answer try again");
                        guessTwo = indexScan.nextInt();
                    }else if(guessTwo != numberOne - numberTwo){
                        System.out.println("the correct answer is: " + (numberOne - numberTwo));
                        System.out.println("Do you want to play again(y) or quit(q)?");
                        userInput = indexScan.next();
                        if( userInput.contains("q")){
                            quit = true;
                        }else if(userInput.contains("y")){
                            quit= false;
                        }
                    }else if(guess == guessOne - guessTwo){
                        System.out.println("Good Job!");
                        System.out.println("Do you want to play again(y) or quit(q)?");
                        userInput = indexScan.next();
                        if( userInput.contains("q")){
                            quit = true;
                        }else if(userInput.contains("y")){
                            quit= false;
                        }
                    }


                case 2:
                    System.out.println("Here is your equation " + numberOne + "*" + numberTwo);
                    System.out.println("What is your Answer?");
                    guessOne = indexScan.nextInt();
                    if(guessOne != numberOne * numberTwo){
                        System.out.println("Wrong answer try again");
                        guessTwo = indexScan.nextInt();
                    }else if(guessTwo != numberOne * numberTwo){
                        System.out.println("the correct answer is: " + (numberOne * numberTwo));
                        System.out.println("Do you want to play again(y) or quit(q)?");
                        userInput =indexScan.next();
                        if( userInput.contains("q")){
                            quit = true;
                        }else if(userInput.contains("y")){
                            quit= false;
                        }
                    }else if(guess == guessOne * guessTwo){
                        System.out.println("Good Job!");
                        System.out.println("Do you want to play again(y) or quit(q)?");
                        userInput = indexScan.next();
                        if( userInput.contains("q")){
                            quit = true;
                        }else if(userInput.contains("y")){
                            quit= false;
                        }
                    }

                    break;
                    
                default:
                    System.out.println("not an equation");
            } //Switch Case

        } //while loop

    }
}