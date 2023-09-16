public class Main {
        public static void main(String[] args) {

        Iphone14 iphone = new Iphone14();
        myDisplay(iphone);

        SamsungGalaxy s = new SamsungGalaxy();
        myDisplay(s);

        Dryer d = new Dryer();
        DryerAdaptor dryerAdaptor = new DryerAdaptor(d);
        myDisplay(dryerAdaptor);


    }

    public static void myDisplay(Product p){
        p.display();
    }

}