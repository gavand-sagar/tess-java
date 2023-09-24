public class Main {
        public static void main(String[] args) {

            Brand b = new Brand("Apple");
            Product p = new Product();

            Mediator m = new Mediator(b,p);
            p.setMediator(m);
            b.setMediator(m);


            p.display();




    }
}