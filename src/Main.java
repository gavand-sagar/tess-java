import java.util.HashMap;
import java.util.Map;

public class Main {
        public static void main(String[] args) {

                int[] array = new int[]{3,5,6,7,8,9,10};

//                if(binarySearch(array,17)){
//                        System.out.println("Found");
//                }else{
//                        System.out.println("Not found");
//                }

                if(binarySearchWithIndex(array,7)){
                        System.out.println("Found");
                }else{
                        System.out.println("Not found");
                }



        }


        public  static boolean binarySearchWithIndex(int[] array,int value){
                return binarySearchHelper(array,value,0,array.length);
        }


        public  static   boolean binarySearchHelper(int[] array,int value,int start,int end){
                if(start>end){
                        return  false;
                }
                if(start == end){
                        return value == array[start];
                }
                int mid =  ((end - start) / 2 ) + start;
                if(array[mid] == value) {
                        return  true;
                }else if (value < array[mid]){
                        return  binarySearchHelper(array,value,0,mid);
                }else{
                        return  binarySearchHelper(array,value,mid+1, array.length);
                }
        }



        public  static  boolean binarySearch(int[] array,int value){
                if(array.length == 0){
                        return  false;
                }
                if(array.length == 1){
                        return (array[0] == value);
                }

                int midValue = getMidValue(array);

                if(midValue == value){
                        return true;
                }else if(value < midValue){
                        int[] left = getLeft(array);
                        return binarySearch(left,value);
                }else{ // value > midValue
                        int[] right = getRight(array);
                        return binarySearch(right,value);
                }

        }

        private static int[] getRight(int[] array) {
                int midIndex = array.length / 2;
                int newLength = array.length - (midIndex +1);
                int[] right = new int[newLength];
                int c = 0;
                for (int i = midIndex + 1 ; i < array.length; i++) {
                        right[c] = array[i];
                        c++;
                }
                return right;
        }

        private static int[] getLeft(int[] array) {
                int midIndex = array.length / 2;
                int[] left = new int[midIndex];
                for (int i = 0; i < midIndex; i++) {
                        left[i] = array[i];
                }
                return left;
        }

        private static int getMidValue(int[] array) {
                int midIndex = array.length / 2;
                return array[midIndex];
        }


}