import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static  WordsCollection wordsCollection = new WordsCollection();
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            MyConsole.println("Enter a sentence: ");
            String input = scanner.nextLine();
            String[] words = input.split(" ");
            for (String eachWord:words) {
                if(!wordsCollection.isValid(eachWord)){
                    MyConsole.printRed( eachWord + " ");
                }else{
                    MyConsole.print(eachWord + " ");
                }
            }

    }
}