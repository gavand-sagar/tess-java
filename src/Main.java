import java.util.HashMap;
import java.util.Map;

public class Main {
        public static void main(String[] args) {

                int[] inputArray = new int[]{6,3,1,7,2,4,5};

                int[] res = mergeSort(inputArray);

                for (int n:res) {
                        System.out.println(n);
                }


        }

        static int[] removeFirst(int[] input){
                int[] arr = new int[input.length - 1];
                for (int i = 0; i < arr.length; i++) {
                      arr[i] = input[i+1];
                }
                return arr;
        }




        public static int[] left(int[] array){
                int mid = array.length/2;
                int[] newArray = new int[mid];
                for(int i = 0; i < mid; i++) {
                        newArray[i] = array[i];
                }
                return  newArray;
        }

        public static int[] right(int[] array){
                int mid = array.length/2;
                int[] newArray = new int[array.length - mid];
                int c = 0;
                for(int i = mid; i < array.length; i++) {
                        newArray[c] = array[i];
                        c = c + 1;
                }
                return  newArray;
        }

        public static int[] mergeSort(int[] array){

                if(array.length<=1){
                        return array;
                }

                int[] sorted1 = mergeSort(left(array));
                int[] sorted2 = mergeSort(right(array));

                return merge(sorted1,sorted2);

        }




        public static int[] merge(int[] left,int[] right)
        {
                int[] result = new int[left.length + right.length];

                for (int i = 0; i < result.length; i++) {

                        if(left.length > 0 && right.length > 0){
                                int firstRight = right[0];
                                int firstLeft = left[0];
                                if(firstLeft < firstRight){
                                        left = removeFirst(left);
                                        result[i] = firstLeft;
                                }else{
                                        right = removeFirst(right);
                                        result[i] = firstRight;
                                }

                        }else if(left.length == 0 && right.length > 0){

                                //consider only right array and copy elements one by one
                                int firstNumber = right[0];
                                right = removeFirst(right);
                                result[i] = firstNumber;


                        }else if (right.length == 0 && left.length > 0){
                                //consider only left array and copy elements one by one
                                int firstNumber = left[0];
                                left = removeFirst(left);
                                result[i] = firstNumber;
                        }
                }
                return result;
        }
}