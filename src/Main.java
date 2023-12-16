import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Reverse of string using stack

        String input = "({})";
       // 1. read brackets one by one
       // 2. in case of opening bracket, push on stack
       // 3. in case of closing bracket, pop from stack and check if
       //               popped items is opening bracket of same category
        //              if yes continue
        //              if not stop
        // 4. if stack is empty at the end, its a valid expression
        //     else if stack is not empty , its an invalid expression

        Stack<Character> stack = new Stack<>();
        boolean valid = true;
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if(current == '(' || current == '[' || current == '{'){
                stack.push(current);
            }else if(current == ')'){
                if(stack.isEmpty() || stack.pop() != '('){
                    valid = false;
                    break;
                }
            }else if(current == ']'){
                if(stack.isEmpty() || stack.pop() != '['){
                    valid = false;
                    break;
                }
            }
            else if(current == '}'){
                if(stack.isEmpty() || stack.pop() == '{'){
                    valid = false;
                    break;
                }
            }
        }

        if(!valid){
            System.out.println("Invalid Expression");
        }else if(stack.isEmpty()){
            System.out.println("Valid Expression");
        }

    }

        public  static  String reverse(String input){
            StringBuilder output = new StringBuilder();
            Stack<Character> stack = new Stack<Character>();
            // stack  insert one by one      S   a   g   a   r
            for (int i = 0; i < input.length(); i++) {
                stack.push(input.charAt(i));
            }
            // keep removing item one by one;
            while (!stack.isEmpty()){
                output.append(stack.pop());
            }
            return output.toString();
        }

}