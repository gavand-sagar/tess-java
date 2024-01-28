import java.util.HashMap;
import java.util.Map;

public class Main {
        public static void main(String[] args) {

                int[] array = new int[] {5,3,1,7,2,9,6};
                System.out.println("Before");
                for (int number:array) {
                        System.out.print( number + "\t");
                }
                System.out.println();
                System.out.println("After");
                int[] result = quickSort(array);
                for (int number:result) {
                        System.out.print( number + "\t");
                }
        }

        private static int[] quickSort(int[] array) {
                if(array.length <= 1){
                    return array;
                }
                int mid = getMid(array);
                int[] leftArray = getLowestItems(array,mid);
                int[] rightArray = getGreaterItems(array,mid);
                return concat(quickSort(leftArray),new int[]{mid},quickSort(rightArray));
        }

        private static int[] concat(int[] leftArray, int[] ints, int[] rightArray) {
        }

        private static int[] getGreaterItems(int[] array, int mid) {
        }

        private static int[] getLowestItems(int[] array, int mid) {
        }

        private static int getMid(int[] array) {

        }

}