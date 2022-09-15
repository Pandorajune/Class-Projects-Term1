import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScan = new Scanner(System.in);

        String playerInput;
        boolean quit = false;

        System.out.println("Please enter a letter: ");
        playerInput = inputScan.nextLine();
        playerInput = playerInput.toLowerCase();


        while(!quit){

            if (playerInput.contains("a") || playerInput.contains("e") || playerInput.contains("i") || playerInput.contains("o") || playerInput.contains("u")) {
                System.out.println("This letter is a Vowel");
                System.out.println("Do you want to enter another letter (y) or quit (q)?");
                playerInput = inputScan.nextLine();
                playerInput = playerInput.toLowerCase();

                if (playerInput.contains("q") ){
                    quit = true;
                } else if (playerInput.contains("y")){
                    quit = false;
                    System.out.println("Please enter another letter");
                    playerInput = inputScan.nextLine();
                    playerInput = playerInput.toLowerCase();

                }

            } else {
                System.out.println("This letter is a Consonant");
                System.out.println("Do you want to enter another letter(y) or quit(q)?");
                playerInput = inputScan.nextLine();
                playerInput = playerInput.toLowerCase();

                if (playerInput.contains("q") ){
                    quit = true;
            }else if(playerInput.contains("y")){
                    quit = false;
                    System.out.println("Please enter another letter");
                    playerInput = inputScan.nextLine();
                    playerInput = playerInput.toLowerCase();

                }

        }




    }
  }
}