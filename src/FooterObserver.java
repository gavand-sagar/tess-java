public class FooterObserver implements Observer{
    @Override
    public void update(Object o) {
        System.out.println("Footer : " + o);
    }
}
