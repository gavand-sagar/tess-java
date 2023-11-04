import java.io.BufferedReader;
import java.io.Reader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        int number = scanner.nextInt();
        double area = 3.14 * (float)number * (float)number;
        System.out.println("Area is = " + area );
        System.out.println("Do you want to continue? (y/n)");
        String input = scanner.next();

        if(input.equals("y")){
            main(args);
        }

    }

    public static void Display(Point p){
        if(p == null){
            return;
        }
        System.out.println(p.value);
        Display(p.next);
    }

    static int fact(int number){

        return number <= 1 ? 1 : number * fact(number-1);
    }

    static int factorial(int number){
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact* i;
        }
        return  fact;
    }

}