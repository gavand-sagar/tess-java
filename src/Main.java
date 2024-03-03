import java.util.HashMap;
import java.util.Map;

public class Main {
        public static void main(String[] args) {
                int[] priceLine = new int[]{30,10,20,60,20,70};

                int profit = 0;
                for (int i = 0; i < priceLine.length; i++) {
                        for (int j = i+1; j < priceLine.length; j++) {
                                int buy = priceLine[i];
                                int sell = priceLine[j];

                                int p = sell - buy;
                                if(profit <= p){
                                        profit = p;
                                }

                         }
                }
                System.out.println("profit : " + profit);


//                int temp = 0;
//                for (int i = 0; i < priceLine.length - 1; i++) {
//                        int next = priceLine[i+1];
//                        int current = priceLine[i];
//                        int profit = next-current;
//                        if(profit>temp){
//                                temp = profit;
//                        }
//                }
//
//                System.out.println(temp);



        }


}