public class Main {
        public static void main(String[] args) {

                Customer c = new Customer();
                c.calculateDiscount();

                c.setTypeOfCustomer(new BronzeCustomer());
                c.calculateDiscount();


                c.setTypeOfCustomer(new DiamondCustomer());
                c.calculateDiscount();





    }
}