public class Main {
        public static void main(String[] args) {


            Product p = new Product(new ConsoleLogger());
            p.saveProduct();


            /*
             Product p = new Product(new FileLogger());
             p.saveProduct();
            */


        }
}