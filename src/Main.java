import javax.swing.*;
import java.util.Scanner;

public class Main {
      private  static  IStack stack = new StackDynamic();
      public static void main(String[] args) throws Exception {


          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter numbers (-1) to stop.");
          int num = 0;
          while (true){
              num = scanner.nextInt();
              if(num < 0){
                  break;
              }
              stack.push(num);
          }

          System.out.println("\nNumbers in reverse order\n");

          while (!stack.isEmpty()){
              System.out.println(stack.pop());
          }

//            System.out.println(stack.isEmpty()); // true;
//
//            stack.push(4);
//            stack.push(5);
//            stack.push(6);
//
//
//            System.out.println(stack.peek());  // 6
//            System.out.println(stack.peek());  // 6
//
//            System.out.println(stack.pop());  // 6
//            System.out.println(stack.pop());  // 5
//
//            System.out.println(stack.size());  // 1
//
//            stack.push(6);
//            stack.push(6);
//            stack.push(6);
//            stack.push(6);
//            stack.push(6);
//            stack.push(6);
//            stack.push(6);
//            stack.push(6);
//            stack.push(888);
//
//            System.out.println(stack.peek());  // 888

    }
}