import java.util.HashMap;
import java.util.Map;

public class Main {
        public static void main(String[] args) {

                int[] numbers = new int[]{1,3,5,6,9,10,50,70,71};;
                        //display all numbers

                for (int i = 0; i < numbers.length - 1; i++) {
                        int current = numbers[i];
                        int next = numbers[i+1];
                        if( isOdd (current)  && (current + 2 == next)){
                                System.out.println(current + "," + next);
                        }
                        
                }

                        // dipslay current and next


                        // display only when its n the sequemce
        }

        public static  boolean isOdd(int number){
                if(number % 2 != 0){
                        return true;
                }else{
                        return false;
                }
        }



}