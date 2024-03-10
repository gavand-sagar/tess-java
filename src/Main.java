import java.util.*;

public class Main {
        public static void main(String[] args) {

                var front = new Point(10,new Point(20,new Point(40,new Point(70,null))));

                front.display();

                System.out.println("===============================");
                System.out.println("===============================");
                front = reverseLinkedList(front);

                front.display();


        }
        public static Point reverseLinkedList(Point front) {
                Point prev = null;
                Point current = front;
                Point next = null;

                while (current != null) {
                        next = current.next;
                        current.next = prev;
                        prev = current;
                        current = next;
                }

                return prev;
        }



}