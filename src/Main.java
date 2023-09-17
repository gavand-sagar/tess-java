import java.util.Arrays;

public class Main {
        public static void main(String[] args) {

            ProductFlyweitghtFactory f = new ProductFlyweitghtFactory();

            for (int i = 0; i < 1000; i++) {
                Product p = f.getProduct("Samsung");
                p.display();

                System.out.println("===============================================");
            }


        Product p2 = f.getProduct("Samsung");
        p2.display();

            System.out.println("===============================================");


        Product p3 = f.getProduct("Apple");
        p3.display();

            System.out.println("===============================================");

        Product p4 = f.getProduct("Samsung");
        p4.display();

            System.out.println("===============================================");
            System.out.println("===============================================");

        System.out.println("Total Objects Created = " + Product.numberOfObjects);

    }
}