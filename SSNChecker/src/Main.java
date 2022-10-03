import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner indexScan = new Scanner(System.in);
        boolean quit = false;
        String ssnInput;
        while (!quit) {
            System.out.println("Please enter your Social Security Number: ");
            ssnInput = indexScan.next();
            if(ssnInput.length() == 11) {
                if (ssnInput.charAt(3) == '-' && ssnInput.charAt(6) == '-') {
                    System.out.println("Correct Format!");
                    quit = true;
                }
            }
            if (ssnInput.length() > 11) {
                System.out.println("Incorrect format, try again");
            } else if (!(ssnInput.contains("-"))) {
                System.out.println("Wrong format please try again");
            } else if (ssnInput.charAt(1) != '-' & ssnInput.charAt(2) != '-' &
                    ssnInput.charAt(3) != '-' & ssnInput.charAt(4) != '-' & ssnInput.charAt(5) != '-' &
                    ssnInput.charAt(6) != '-' & ssnInput.charAt(7) != '-' & ssnInput.charAt(8) != '-' &
                    ssnInput.charAt(9) != '-' & ssnInput.charAt(10) != '-' ) {
                System.out.println("Wrong format please try again");
            }
        }//While loop
    }
}