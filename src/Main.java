import javax.swing.*;

public class Main {
      private  static  IStack stack = new Stack();
      public static void main(String[] args) throws Exception {

            System.out.println(stack.isEmpty()); // true;

            stack.push(4);
            stack.push(5);
            stack.push(6);


            System.out.println(stack.peek());  // 6
            System.out.println(stack.peek());  // 6

            System.out.println(stack.pop());  // 6
            System.out.println(stack.pop());  // 5

            System.out.println(stack.size());  // 1


    }
}