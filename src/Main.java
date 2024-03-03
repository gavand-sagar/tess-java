import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
        public static void main(String[] args) {


                int[] candies = new int[] {1,2,5,10,30,60,30,30,5,10,10,20};
                sortArray(candies);

                int totalCost = 0;

                for (int i = candies.length-1; i >= 0; i-=3) {
                    totalCost += candies[i];
                    if(i>0){
                        totalCost += candies[i-1];
                    }
                }

                System.out.println(totalCost);

        }

    private static void sortArray(int[] candies) {
            Arrays.sort(candies);
    }


}