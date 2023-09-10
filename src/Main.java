public class Main {
        public static void main(String[] args) {

                ProductBuilder builder = new ProductBuilder();
                Product p = builder.asAppleMobile().build();
                p.display();

    }
}