import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String input;
        String newDig;
        System.out.println("Please enter a Integer: ");
        input = num.next();
        newDig = reversed(input);
    }//end of main
    public static String reversed(String input){
        for(int i = 0; i < input.length(); i++) {
            System.out.println(Character.toString(input.charAt(input.length() - i -
                    1)));
        }
        return input;
    }//end of Reverse
}