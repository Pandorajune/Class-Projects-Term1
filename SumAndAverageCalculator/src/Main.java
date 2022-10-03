import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int[] numbers = new int[25];
        int sum = 0;
        for(int i = 0 ; i < 25; i++) {
            numbers[i] = randomNumber.nextInt(101);
            System.out.println(numbers[i]);
            sum = numbers[i] + sum;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + sum/25);
    }
}