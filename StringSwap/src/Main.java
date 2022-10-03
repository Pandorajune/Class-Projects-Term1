import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String[] strings = new String[10];
        String[] reverseStrings = new String[10];
        strings[0] = "Zero";
        strings[1] = "One";
        strings[2] = "Two";
        strings[3] = "Three";
        strings[4] = "Four";
        strings[5] = "Five";
        strings[6] = "Six";
        strings[7] = "Seven";
        strings[8] = "Eight";
        strings[9] = "Nine";
        System.out.println("Before flip: " + Arrays.toString(strings));
        for(int i = 0; i < 10; i++){
            reverseStrings[i] = strings[9-i];
        }
        System.out.println("After flip: " + Arrays.toString(reverseStrings));
    }
}