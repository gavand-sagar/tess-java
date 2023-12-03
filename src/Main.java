import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);


            IMyLinkedList<Integer> list = new MyLinkedList<Integer>();
            list.push(10);
            list.push(20);
            list.push(30);
            list.push(40);
            list.push(50);

            list.display();
            System.out.println("\n----");
            list.reverse();
            list.display();
        }

}
