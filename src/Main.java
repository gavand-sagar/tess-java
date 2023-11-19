import static java.awt.geom.Rectangle2D.intersect;

public class Main {
        public static void main(String[] args) {
            int[] input1 =  { 1,3,2,4,5,8 };
            int[] input2 =  {1,9,4,6,5,7};
            int[] output = intersect(input1,input2);

            for (int num: input1) {
                System.out.print(num + ", ");
            }
            System.out.println("\n==================");
            for (int num: input2) {
                System.out.print(num + ", ");
            }
            System.out.println("\n==================");
            System.out.println("\n======Output========");
            for (int num: output) {
                System.out.print(num + ", ");
            }

        }

    private static int[] intersect(int[] input1, int[] input2) {
        int length = getTotalCommon(input1, input2);
        int[] outputArray = new  int[length];
            int couter = 0;
            for (int num: input1) {
                if(doesContains(input2,num)){
                    outputArray[couter++] = num;
                }
            }

            return outputArray;
    }

    private static int getTotalCommon(int[] input1, int[] input2) {
        int length = 0;
        for (int num: input1) {
            if(doesContains(input2,num)){
                length++;
            }
        }
        return length;
    }

    private static int[] union(int[] input1, int[] input2) {
            int[] outputArray = new int[(input1.length + input2.length) - getTotalCommon(input1,input2)];
            int counter = 0;
            for (int num:input1) {
                if(!doesContains(outputArray,num)){
                    outputArray[counter++] = num;
                }
            }
            for (int num:input2) {
                if(!doesContains(outputArray,num)){
                    outputArray[counter++] = num;
                }
            }
            return outputArray;

    }

    private static boolean doesContains(int[] inputArray, int num) {
        for (int item:inputArray) {
            if(item == num){
                return  true;
            }
        }
        return false;
    }

    private static int[] evenNumbersAtOneSide(int[] inputArray) {
            int[] newArray = new int[inputArray.length];

            int counter = 0;
            for (int num:inputArray) {
                if(num%2 == 0){
                    newArray[counter++] = num;
                }
            }
            for (int num:inputArray) {
                if(num%2 != 0){
                    newArray[counter++] = num;
                }
            }
            return  newArray;
    }

    private static int[] negativeAtOneSide(int[] inputArray) {
            // create temp outputArray
            int[] outputArray = new int[inputArray.length];
            int counter = 0;
           // iterate through all negative elements from inputArray
            for (int num:inputArray) {
                if(num<0){
                    outputArray[counter] = num;
                    counter++;
                }
            }
            // iterate through all 0 elements from inputArray
            for (int num:inputArray) {
                if(num==0){
                    outputArray[counter] = num;
                    counter++;
                }
            }
           // iterate through all positive elements from inputArray
            for (int num:inputArray) {
                if(num>0){
                    outputArray[counter] = num;
                    counter++;
                }
            }
            // return outputArray
            return outputArray;
    }

    private static int[] positiveOnly(int[] numbers) {

            int total = 0;
            for (int num:numbers) {
                if(num>0){
                    total++;
                }
            }
            int[] arr = new int[total];
            int newIndex = 0;
            for (int num:numbers) {
                if(num>0){
                    arr[newIndex] = num;
                    newIndex++;
                }
            }
            return arr;
    }

    private static void successiveNumbers(int[] numbers) {
        for (int i = 0; i < (numbers.length-1); i++) {
            int currentNumber = numbers[i];
            int nextNumber = numbers[i+1];
            if(currentNumber+1 == nextNumber){
                System.out.println(currentNumber + ", " + nextNumber);
            }
        }
    }

    private static void successiveEvenNumbers(int[] numbers) {
        for (int i = 0; i < (numbers.length-1); i++) {
            int currentNumber = numbers[i];
            int nextNumber = numbers[i+1];
            if(currentNumber%2 == 0  && (currentNumber+2 == nextNumber)) {
                System.out.println(currentNumber + ", " + nextNumber);
            }
        }
    }

    private static void evenPairs(int[] numbers) {
        for (int i = 0; i < (numbers.length-1); i++) {
            int currentNumber = numbers[i];
            int nextNumber = numbers[i+1];
            if(currentNumber%2==0  &&  nextNumber%2 == 0){
                System.out.println(currentNumber + ", " + nextNumber);
            }
        }
    }

    private static void primePairs(int[] numbers) {
        for (int i = 0; i < (numbers.length-1); i++) {
            int currentNumber = numbers[i];
            int nextNumber = numbers[i+1];
            if(isPrime(currentNumber) && isPrime(nextNumber)){
                System.out.println(currentNumber + ", " + nextNumber);
            }
        }
    }

    private static boolean isPrime(int currentNumber) {
            currentNumber = Math.abs(currentNumber);
            for (int i = 2; i <= (currentNumber/2) ;i++){
                if(currentNumber%i == 0){
                    return false;
                }
            }
            return true;
    }
}