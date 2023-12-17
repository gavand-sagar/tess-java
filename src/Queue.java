import java.util.Stack;

public class Queue {
    Stack<Integer> stack = new Stack<>();
    void enqueue(int item){
        stack.push(item);
    }
    int dequeue() throws Exception {
        if(stack.isEmpty()){
            throw new Exception("Underflow");
        }
        int item = 0;
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()){
            item = stack.pop();
            if(!stack.isEmpty()){
                tempStack.push(item);
            }

        }
        while (!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }
        return item;
    }
    int size(){
        return stack.size();
    }
    boolean isEmpty(){
        return  stack.isEmpty();
    }


}
