import java.util.HashMap;
import java.util.Map;

public class Main {
        public static void main(String[] args) {

            int[] input = new int[]{4,1,2,6,3,4,9};

            System.out.println("Before Sort");

            for (int number: input) {
                System.out.print(number + "\t");
            }

            System.out.println();
            System.out.println();

            for (int j = 0; j < input.length-1; j++) {
                for (int i = 0; i < (input.length - 1 - j); i++) {
                    int current =  input[i];
                    int next = input[i+1];
                    if(current>next){
                        //swap
                        input[i+1] = current;
                        input[i] = next;
                    }
                }
            }




            //BUBBLE SORT LOGIC

            System.out.println("AfterSort");

            for (int number: input) {
                System.out.print(number + "\t");
            }

        }



}