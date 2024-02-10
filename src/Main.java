import java.util.HashMap;
import java.util.Map;

public class Main {

        static Map<Integer,Integer> results = new HashMap<>();
        public static void main(String[] args) throws InterruptedException {

                // 0  1  1  2  3  5  8  13  21  34

                //   nth position   fibo(0)  ==> 0
                //   nth position   fibo(1)  ==> 1
                //   nth position   fibo(2)  ==> 1
                //   nth position   fibo(3)  ==> 2
                //   nth position   fibo(7)  ==> 13

                System.out.println(fibo(0));
                System.out.println(fibo(1));
                System.out.println(fibo(2));
                System.out.println(fibo(3));
                System.out.println(fibo(4));
                System.out.println(fibo(5));
                System.out.println(fibo(6));
                System.out.println(fibo(7));
                System.out.println(fibo(8));
                System.out.println(fibo(9));


        }


        static int fibo(int n) throws InterruptedException {

                if(results.containsKey(n)){
                        return results.get(n);
                }

                if(n == 0){
                        results.put(n,0);
                        return 0;
                }

                if(n == 1){
                        results.put(n,1);
                        return  1;
                }

                Thread.sleep(1000);
                int res = fibo(n-1) + fibo(n-2);
                results.put(n,res);
                return res;

        }





}