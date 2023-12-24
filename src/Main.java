import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Set<Integer> set = new HashSet<>();
            while (true){
                System.out.println("Enter a number");
                int number = scanner.nextInt();
                if(number < 0){
                    break;
                }
                set.add(number);
            }

            System.out.println(set);

    }
}