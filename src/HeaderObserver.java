public class HeaderObserver implements Observer{
    @Override
    public void update(Object o) {
        ///
        System.out.println("Object new value is : " + o);
    }
}
