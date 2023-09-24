public class Main {
        public static void main(String[] args) {


            UserNameSubject s = new UserNameSubject();
            s.subscribe(new HeaderObserver());;

            Observer o = new FooterObserver();
            s.subscribe(o);;


            s.setUsername("Sagar");


            s.unSubscribe(o);;

            s.setUsername("Rahul");



    }
}