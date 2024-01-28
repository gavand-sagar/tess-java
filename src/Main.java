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
                return concat(quickSort(leftArray),mid,quickSort(rightArray));
        }

        private static int[] concat(int[] leftArray, int middle, int[] rightArray) {
                int[] res = new int[leftArray.length + 1 + rightArray.length];
                int c = 0;
                for (int item :leftArray) {
                       res[c++] =item;
                }
                res[c++] = middle;
                for (int item :rightArray) {
                        res[c++] =item;
                }
                return res;
        }

        private static int[] getGreaterItems(int[] array, int mid) {
                int totalGreaterNumbers = getTotalOfGreaterNumber(array,mid);
                int[] temp = new int[totalGreaterNumbers];
                int c = 0;
                for (int item:array) {
                        if(item>mid){
                             temp[c++] = item;
                        }
                }
                return temp;
        }

        private static int getTotalOfGreaterNumber(int[] array, int mid) {
                int couter = 0;
                for (int item:array) {
                        if(item>mid){
                                couter++;
                        }
                }
                return couter;
        }

        private static int[] getLowestItems(int[] array, int mid) {
                int totalLowerNumber = getTotalOfLowerNumber(array,mid);
                int[] temp = new int[totalLowerNumber];
                int c = 0;
                for (int item:array) {
                        if(item<mid){
                            temp[c++] = item;
                        }
                }
                return temp;
        }

        private static int getTotalOfLowerNumber(int[] array, int mid) {
                int couter = 0;
                for (int item:array) {
                        if(item<mid){
                                couter++;
                        }
                }
                return couter;
        }

        private static int getMid(int[] array) {
                return array[array.length / 2];
        }

}