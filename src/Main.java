import java.util.*;

public class Main {


        public static void main(String[] args) {

                int[] allCoins = new int[]{ 20,10,5,2,1};
                int amount = 65;

                List<Integer> coins = minCoins(allCoins,amount);
                System.out.println(coins);
        }

        public static List<Integer> minCoins(int[] coins, int amount) {
                List<Integer>[] memo = new ArrayList[amount + 1];
                return minCoins(coins, amount, memo);
        }

        public static List<Integer> minCoins(int[] coins, int amount, List<Integer>[] memo) {
                if (amount == 0) {
                        return new ArrayList<>(); // Base case: if amount is 0, no coins are needed.
                }

                if (memo[amount] != null) {
                        return memo[amount];
                }

                List<Integer> minCoins = null;

                for (int coin : coins) {
                        if (coin <= amount) {
                                List<Integer> coinsUsed = minCoins(coins, amount - coin, memo);
                                if (coinsUsed != null) {
                                        coinsUsed = new ArrayList<>(coinsUsed); // Create a new list to avoid mutating previously stored result
                                        coinsUsed.add(coin);
                                        if (minCoins == null || coinsUsed.size() < minCoins.size()) {
                                                minCoins = coinsUsed;
                                        }
                                }
                        }
                }

                memo[amount] = minCoins; // Store the result in the memo table
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