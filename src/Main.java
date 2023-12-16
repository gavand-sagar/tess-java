import java.util.Stack;

public class Main {
        public static void main(String[] args) {
            // Reverse of string using stack
            String name = "Sagar";
            String reverseOfName = reverse(name);
            System.out.println(reverseOfName);
            // r    a   g   a   S
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