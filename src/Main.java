public class Main {
        public static void main(String[] args) {

        String input = "r";

        IMyShape shape = new ShapeFactory().GetShape(input);
        shape.Display();


        System.out.println("Hello world!");

    }
}