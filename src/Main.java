public class Main {
        public static void main(String[] args) throws CloneNotSupportedException {
        Product p1 = new Product("Samsung");
        p1.author.name = "Sagar";


        Product p2 = p1.clone();  /// this is not a clone
        p2.brand = "Apple";
        p2.author.name = "Amit";


        p1.display();
        p2.display();



        System.out.println("Hello world!");

    }
}