import java.util.HashMap;
import java.util.Map;

public class Main {

        static Map<Integer,Integer> results = new HashMap<>();
        public static void main(String[] args) throws InterruptedException {

                System.out.println(sumFrom1ToN(5));
                System.out.println(sumFrom1ToN(5));
                System.out.println(sumFrom1ToN(5));

                System.out.println(sumFrom1ToN(6));
                System.out.println(sumFrom1ToN(7));

        }

        public  static  int sumFrom1ToN(int input) throws InterruptedException {
                if(results.containsKey(input)){
                       return  results.get(input);
                };


                if(input == 1 ){
                        results.put(input,1);
                        return 1;
                }

                Thread.sleep(1000);
                int output = input + sumFrom1ToN(input - 1);
                results.put(input,output);
                return output;
        }



}