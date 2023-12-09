import javax.swing.*;

public class Main {
      private  static  IStack stack = new StackDynamic();
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

            stack.push(6);
            stack.push(6);
            stack.push(6);
            stack.push(6);
            stack.push(6);
            stack.push(6);
            stack.push(6);
            stack.push(6);
            stack.push(888);

            System.out.println(stack.peek());  // 888

    }
}