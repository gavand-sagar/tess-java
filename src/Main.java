import java.util.HashMap;
import java.util.Map;

public class Main {
        public static void main(String[] args) {

                int[] numbers = new int[]{1,3,5,6,9,10,50,70,71};;
                        //display all numbers

                for (int i = 0; i < numbers.length - 1; i++) {
                        int current = numbers[i];
                        int next = numbers[i+1];
                        if(current + 1 == next){
                                System.out.println(current + "," + next);
                        }
                        
                }

                        // dipslay current and next


                        // display only when its n the sequemce
        }


}