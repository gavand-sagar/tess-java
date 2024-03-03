import java.util.HashMap;
import java.util.Map;

public class Main {
        public static void main(String[] args) {

                int[] priceLine = new int[]{40,20,30,10,20,60,20,70};

                int profit = 0;

                for (int i = 0; i < priceLine.length-1; i++) {
                        int current = priceLine[i];
                        int next = priceLine[i+1];
                        if(next>current){
                                System.out.println(current+","+next);
                                profit += next-current;
                        }

                }

                System.out.println("profit: " + profit);


        }


}