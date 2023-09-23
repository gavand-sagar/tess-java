public class Main {
        public static void main(String[] args) {

//        Handler handler = new Dance();
//        Handler handler2 = new Sing();
//        Handler handler3 = new Dance();
//        Handler handler4 = new Dance();
//
//        handler.setNextHandler(handler2);
//        handler2.setNextHandler(handler3);
//        handler3.setNextHandler(handler4);

                new Dance(new Sing()).handle();

                System.out.println("=====================");
                System.out.println("=====================");

                new Dance(new Sing(new Eat(new Dance(new Sing())))).handle();

                System.out.println("=====================");
                System.out.println("=====================");


                new Dance(new Sing(new Eat())).handle();

                System.out.println("=====================");
                System.out.println("=====================");

    }
}