public class Main {
        public static void main(String[] args) {
            System.out.println(factorialTail(5,1));
        }

        //non tail
        int factorial(int number){
            if(number<=1){
                return  1;
            }
            else{
                return number * factorial(number - 1);
            }
        }

        //tail
        static  int factorialTail(int number,int out){
            if(number<=1){
                return  out;
            }
            out = out * number;
            return factorialTail(number-1, out);
        }

        public static void fun1(int number){
            System.out.println(number);
            if(number <10){
                fun2(number+1);
            }
        }
        public static void fun2(int number){
            System.out.println(number);
            if(number <10){
                fun1(number+1);
            }

        }

}