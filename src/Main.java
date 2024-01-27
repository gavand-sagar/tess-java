import java.util.HashMap;
import java.util.Map;

public class Main {
        public static void main(String[] args) {

                int[] array = new int[]{5,6,1,2,9};

                for (int i = 1; i < array.length; i++) {
                        int val = array[i];
                        int j = i-1;
                        while (j >= 0 && (array[j] > val)){
                                array[j+1] = array[j];
                                j--;
                        }
                        array[j+1] = val;
                }


                for (int number: array) {
                        System.out.println(number);
                }

        }


}