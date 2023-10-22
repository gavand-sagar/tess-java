public class Main {

    public static void main(String[] args) {
//        int number = 3;
//        printNumbers(number);
//        int total = getSum(number);
//        System.out.println("Total: "+ total);

        //print1toN(3,10);


// //// example of factorial
//        int number = 5;
//        int fact = factorial(number);
//        System.out.println("Factorial: " + fact); //120
//        //   5 * 4 * 3 * 2 * 1



//        int[] numbers = new int[5];
//        numbers[0] = 100;
//        numbers[1] = 2000;
//        numbers[2] = 350;
//        numbers[3] = 33;
//        numbers[4] = 45;//
//        displayArray(2,numbers);



        int number = 2;
        int power = 0;
        try{
            int result = calcPower(number,power);
            System.out.println("result: " + result); // 16
        }catch(Exception e ){

        }



    }

    public  static  int calcPower(int number,int power) throws Exception{
        if(power < 0){
            throw new Exception("Negative power is not supported");
        }
        if(power == 0){
            return 1;
        }
        return number * calcPower(number,power-1);
    }



    public  static  void displayArray(int i,int[] numbers){
        if(i<0){
            return;
        }
        if(i >= numbers.length){
            return;
        }
        System.out.println(numbers[i]);
        displayArray(i + 1,numbers);

    }

    public static  int factorial(int number){
        if(number<=0){
            return 1;
        }
        return number * factorial(number - 1);
    }

    public  static  void print1toN(int counter,int limit){
        if(counter > limit){
            return;
        }
        System.out.println(counter);
        print1toN(counter + 1,limit);

    }


    public static  int getSum(int n){
        if(n<1){
            return 0;
        }
        return n + getSum(n-1);

    }


    public static  void printNumbers(int n){
        if( n < 1){
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);
    }



}