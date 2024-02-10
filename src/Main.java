import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TransferQueue;

public class Main {

        static  Map<Integer,Integer> results = new HashMap<>();
        public static void main(String[] args) throws InterruptedException {
                System.out.println(factorial(5));
                System.out.println(factorial(5));
                System.out.println(factorial(5));
                System.out.println(factorial(5));


                System.out.println(factorial(6));
        }
        /// memoization  -->
        private static int factorial(int input) throws InterruptedException{
                if(results.containsKey(input)){
                        return  results.get(input);
                }

                if(input<=1){
                        results.put(input,1);
                        return 1;
                }
                Thread.sleep(1000);
                int res = input * factorial(input - 1);
                results.put(input,res);
                return res;
        }


}