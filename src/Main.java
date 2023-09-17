public class Main {
        public static void main(String[] args) {

            PlainPizza p = new PlainPizza();
            System.out.println(p.getPrice());

            CheesePizza c = new CheesePizza(p);
            System.out.println(c.getPrice());

            PaneerPizza cc = new PaneerPizza(c);
            System.out.println(cc.getPrice());

    }
}