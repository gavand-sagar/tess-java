import java.util.HashMap;
import java.util.Map;

public class Main {

        public  static  int counter = 0;
        public static Map<String,Boolean> memo = new HashMap<>();
        public static boolean isPalindrome(String input) throws InterruptedException {

                if(memo.containsKey(input)){
                        return memo.get(input);
                }


                counter++;
                StringBuilder reverse = new StringBuilder();
                for (int i = input.length() - 1 ; i >= 0; i--) {
                        reverse.append(input.charAt(i));
                }
                boolean result = reverse.toString().equals(input);
                memo.put(input,result);
                if(result){
                        while (input.length() > 2){
                                input = input.substring(1, input.length() - 1);
                                memo.put(input,true);
                        }
                }

                return result ;
        }

        public static void main(String[] args) throws InterruptedException {

                String str = "malayalam";


                for (int j = 0; j < str.length(); j++) {
                        String temp = "";
                        for (int i = j; i < str.length(); i++) {
                                temp+=str.charAt(i);
                                if(temp.length() > 1 && isPalindrome(temp)){
                                        System.out.print(temp + " | ");
                                }
                        }
                }

                System.out.println("\ncounter- " + counter);
        }


}