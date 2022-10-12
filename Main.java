import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// Correct CC# 4388576018410707

        System.out.println("Please enter your Credit Card Number: ");
        String cardNum = input.nextLine();
        int[] card = new int[16];
        int numberOne = 0;
        int numberTwo = 0;
        int finalNumber;


        stepOne(card, cardNum);
        stepTwo(card, cardNum);
        numberOne = stepThree(card, numberOne);
        numberTwo = stepFour(card, numberTwo);
        finalNumber = stepFive(numberOne, numberTwo);
        stepSix(finalNumber);

    }
    public static String stepOne(int[] card, String cardNum) {

        int i;
        for (i = 0; i < cardNum.length(); i++) {
            card[i] = Integer.parseInt(Character.toString(cardNum.charAt(i)));
        }

        //System.out.println(Arrays.toString(card));

        for(i = 0; i < cardNum.length(); i++){
            card[i] = card[i++] * 2;
        }
        System.out.println("Here is every other number doubled starting from left to right: ");
        System.out.println(Arrays.toString(card));

        return cardNum;
    }

    public static String stepTwo(int[] card, String cardNum){

        int i;
        for(i = 0; i< cardNum.length(); i++){
            if(card[i] >= 10 ){
                card[i] = card[i] / 10 + card[i] % 10;
            }
        }

        System.out.println("Here are the single numbers: ");
        System.out.println(Arrays.toString(card));

        return cardNum;
    }
    public static int stepThree(int[] card, int numberOne){

        numberOne = numberOne + card[0] + card[2] + card[4] + card[6] + card[8] + card[10] + card[12] + card[14];

        System.out.println("Result of adding all single digit numbers from step 1: ");
        System.out.println(numberOne);

        return numberOne;
    }
    public static int stepFour(int[] card, int numberTwo){

        numberTwo = numberTwo + card[1] + card[3] + card[5] + card[7] + card[9] + card[11] + card[13] + card[15];

        System.out.println("Result of adding every other number from right to left: ");
        System.out.println(numberTwo); // needs to equal 41 for card number 4388576018410707

        return numberTwo;
    }
    public static int stepFive(int numberOne, int numberTwo){

        int finalNumber = numberOne + numberTwo;

        System.out.println("Result of adding the first number with the second number: ");
        System.out.println(finalNumber);

        return finalNumber;
    }

    public static int stepSix(int finalNumber){

        if (finalNumber % 10 == 0){
            System.out.println("This Card is Valid"); //4388576018410707
        } else {
            System.out.println("This Card is Invalid"); //4388576018402626
        }

        return finalNumber;
    }
}