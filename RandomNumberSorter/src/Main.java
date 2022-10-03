import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random randNum = new Random();
        int[] numbers = new int[1000];
        int count = 0;
        int[] list = new int[10];
        System.out.println("|0's |1's |2's |3's |4's |5's |6's |7's |8's |9's| ");
        for(int i = 0; i < 1000; i++){
            int variable = randNum.nextInt(10);
            if(variable == 0){
                count++;
                list[0]++;
            }
            if(variable == 1){
                count++;
                list[1]++;
            }
            if(variable == 2){
                count++;
                list[2]++;
            }
            if(variable == 3){
                count++;
                list[3]++;
            }
            if(variable == 4){
                count++;
                list[4]++;
            }
            if(variable == 5){
                count++;
                list[5]++;
            }
            if(variable == 6){
                count++;
                list[6]++;
            }
            if(variable == 7){
                count++;
                list[7]++;
            }
            if(variable == 8){
                count++;
                list[8]++;
            }
            if(variable == 9){
                count++;
                list[9]++;
            }
        }
        System.out.println(Arrays.toString(list));
    }//Main
}