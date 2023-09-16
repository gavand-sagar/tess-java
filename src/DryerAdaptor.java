public class DryerAdaptor  implements  Product{
    private Dryer localDryer;
    public DryerAdaptor(Dryer d) {
        this.localDryer = d;
    }

    @Override
    public void display() {
        this.localDryer.showData();
    }
}
