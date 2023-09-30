public class SamsungGalaxyOrder extends ProductOrderTemplate{
    @Override
    protected Product getProduct() {
        return new Product("Samsung");
    }
}
