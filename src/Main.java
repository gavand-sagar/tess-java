import java.util.HashMap;
import java.util.Map;

public class Main {
        public static void main(String[] args) {

            int[] array = new int[] {9,12,3,4,5,6,7,8};

            for (int i = 0; i < array.length - 1; i++) {
                int currentNumber = array[i];

                int lowest = i + 1;
                for (int j = i +1 ; j < array.length; j++) {
                    if(array[j]<array[lowest]){
                        lowest = j;
                    }
                }

                if(currentNumber > array[lowest]){
                    array[i] = array[lowest];
                    array[lowest] = currentNumber;
                }


            }


            for (int number:array ) {
                System.out.print(number+"\t");
            }

        }



}