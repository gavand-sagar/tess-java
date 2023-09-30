abstract class   Animal{
    abstract void walk();
    abstract void TalkWithCat(Animal c);
}
class Cat extends  Animal{

    @Override
    void walk() {

    }

    @Override
    void TalkWithCat(Animal c) {

    }
}
class  Tiger extends Animal{
    @Override
    void walk() {

    }
    @Override
    void TalkWithCat(Animal c) {

    }

}


public class Main {
        public static void main(String[] args) {


//            Animal c1 = new  Cat();
//            Animal a = new Tiger();
//            a.walk();;
//            a.TalkWithCat(c1);



            Customer c = new SilverCustomer();
            ProductVisitor p = new XiaomiVisitor();
            c.accept(p);


            //two base type have some dependency on each other


            System.out.println(c.getDiscount());




    }
}