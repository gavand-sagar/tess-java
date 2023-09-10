public class Main {
        public static void main(String[] args) {


        Product p = Product.createProduct();
        p.brand = "Apple";



        Product p1 = Product.createProduct();

        p.display();
        p1.display();

        System.out.println("Hello world!");

    }
}