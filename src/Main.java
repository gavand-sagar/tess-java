import java.util.Stack;

public class Main {
        public static void main(String[] args) {

            Stack<Integer> inputStack = new Stack<>();
            inputStack.push(1);
            inputStack.push(7);
            inputStack.push(3);
            inputStack.push(4);
            inputStack.push(10);



            // while input stack is not empty
               // pop from input stack and let's call it "item"
                    // while (!tempStack.isEmpty() && tempStack.pop() > item)
                    //   : keep popping from temp stack and push it on input stack
                    // push item on temp stack

            Stack<Integer> newStack = new Stack<>();
            while (!inputStack.isEmpty()){
                int item = inputStack.pop();
                while (!newStack.isEmpty() && newStack.peek() > item){
                    inputStack.push(newStack.pop());
                }
                newStack.push(item);
            }

            while (!tempStack.isEmpty()){
                System.out.println(tempStack.pop());
            }
    }
}