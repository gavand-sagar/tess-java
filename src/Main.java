public class Main {
        public static void main(String[] args) {
            int[] numbers =  { 2,10,5,3,-6,-4,8,10,23,4,6,5,3,8,10 };
            int[] positiveOnly = positiveOnly(numbers);

            for (int num: numbers) {
                System.out.print(num + ", ");
            }
            System.out.println("\n==================");
            for (int num: positiveOnly) {
                System.out.print(num + ", ");
            }

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