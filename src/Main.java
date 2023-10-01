public class Main {

        static  IShapeFactory shapeFactory = new ShapeFactory();
        public static void main(String[] args) {

        String input = "r";

        IMyShape shape = shapeFactory.GetShape(input);
        shape.Display();


        System.out.println("Hello world!");

    }
}