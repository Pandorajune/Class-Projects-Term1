import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        System.out.println("Lets play Rock Paper Scissors!");

        System.out.println("What is your choice? Rock(0), Paper(1), or Scissors(2)");
        int choice;
        choice = inputScanner.nextInt();
        System.out.println("You choose: ");
        if(choice == 0){
            System.out.println("Rock!");
        }else if(choice == 1){
            System.out.println("Paper!");
        }else if(choice == 2){
            System.out.println("Scissors!");
        }else{
            System.out.println("Sorry that is not an option");
        }

        int compare;
        compare = randomGenerator.nextInt(3);

        System.out.println("Computers Choice: ");
        if(compare == 0){
            System.out.println("Rock!");
        }else if(compare == 1){
            System.out.println("Paper!");
        }else{
            System.out.println("Scissors!");
        }


        while (choice == compare){
            System.out.println("You choose the same thing, try again");
            choice++;
        }
        // Rock Smashes scissors

        while (choice == 0 && compare == 2){
            System.out.println("Rocks Smashes Scissors!");
            System.out.println("You win!");
            choice++;
        }
        while (choice == 2 && compare == 0){
            System.out.println("Rocks Smashes Scissors!");
            System.out.println("Computer wins!");
            choice++;
        }
        //paper covers rock

        while (choice == 1 && compare == 0){
            System.out.println("Paper Covers Rock!");
            System.out.println("You win!");
            choice++;
        }
        while (choice == 0 && compare == 1){
            System.out.println("Paper Covers Rock!");
            System.out.println("Computer wins!");
            choice++;
        }
        //Scissors cut paper

        while (choice == 1 && compare == 2){
            System.out.println("Scissors cut Paper!");
            System.out.println("Computer wins!");
            choice++;
        }
        while (choice == 2 && compare == 1){
            System.out.println("Scissors cut Paper!");
            System.out.println("You win!");
            choice++;
        }


    }
}