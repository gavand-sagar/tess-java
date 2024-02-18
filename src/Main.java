import java.util.*;

public class Main {
        public static void main(String[] args) {

                int[] allCoins = new int[]{ 20,10,5,2,1};
                int amount = 40;

                List<Integer> coins = minCoins(allCoins,amount);
                System.out.println(coins);

                //display(AllCoins,amount,"\t");
        }

        private static List<Integer> minCoins(int[] allCoins, int amount) {

                if(amount == 0){
                        return new ArrayList<>();
                }

                List<Integer> minCoins = null;
                for (int coin :allCoins){
                        if(coin<=amount){
                                List<Integer> coinsUsed = minCoins(allCoins,amount-coin);
                                if(coinsUsed != null){
                                        coinsUsed.add(coin);
                                        if(minCoins ==null || coinsUsed.size() < minCoins.size()){
                                                minCoins = coinsUsed;
                                        }
                                }
                        }
                }
                return minCoins;
        }

        public static void display(int[] AllCoins,int limit,String tab){
                if(limit<=0){
                        return;
                }
                for (var item: AllCoins) {
                        System.out.println(tab+item);
                        display(AllCoins,limit-1,tab+"\t");
                }
        }


        private static int sumOfCoins(List<Integer> coins) {
                int sum = 0;
                for (var i : coins
                     ) {
                        sum+=i;
                }
                return sum;
        }


}