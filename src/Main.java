import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Set<String> items = new HashSet<>();

            System.out.println("Enter 2 phone numbers");
            while (items.size()<2){
                System.out.println("Enter Phone number");
                if(!items.add(scanner.nextLine())){
                    System.out.println("please enter new data");
                }
            }

            System.out.println("Thank you for entering the details");
            for (String s:items) {
                System.out.print(s+"\t");
            }



            //input --> 56 78 90 56 70
            // output --> 56 78 90 70

    }
}