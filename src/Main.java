import java.util.HashMap;
import java.util.Map;

public class Main {

        public static boolean isPalindrome(String input) throws InterruptedException {
                StringBuilder reverse = new StringBuilder();
                for (int i = input.length() - 1 ; i >= 0; i--) {
                        reverse.append(input.charAt(i));
                }
                return reverse.toString().equals(input);
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


        }


}