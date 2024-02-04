import java.util.HashMap;
import java.util.Map;

public class Main {
        public static void main(String[] args) {

                int[] array = new int[]{7,6,3,9,10,2,4,5};

                if(search(array,1)){
                        System.out.println("Found");
                }else{
                        System.out.println("Not found");
                }


        }

        public static boolean search(int[] array,int value){
                for (int item: array) {
                        if(item == value){
                                return  true;
                        }
                }
                return  false;

        }


}