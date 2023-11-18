public class Main {
    public static void main(String[] args) {
           int[] numbers = {2,4,5,6,1,3};
           //find all number pairs, which addition is 5
           searchAllPairs(numbers,5);
    }
    private static void searchAllPairs(int[] numbers,int sum) {
        for (int i = 0; i < numbers.length; i++) {
            anyPair(numbers,i,sum);
        }
    }
    private static void anyPair(int[] numbers, int i,int sum) {
        for (int j = i+1; j < numbers.length; j++) {
            if((numbers[i] + numbers[j]) == sum){
                System.out.println(numbers[i]+ ", " + numbers[j]);
            }
        }
    }

    public  static  void displayLengthEquals(int len,String[] values){
        for (int i = 0; i < values.length; i++) {
            if(values[i].length() == len){
                System.out.println(values[i]);
            }
        }
    }


    public static void displayStartsWith(String[] values,String letter){
        for (int i = 0; i < values.length; i++) {
            if(values[i].startsWith(letter)){
                System.out.println(values[i]);
            }
        }
    }

    public static void display(String[] values){
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }


    public  static  void displayEven(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                System.out.println(arr[i]);
            }
        }
    }

    public  static void search(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                System.out.println("Found at index " + i );
                return;
            }
        }
        System.out.println("Not found");
    }
    public  static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}