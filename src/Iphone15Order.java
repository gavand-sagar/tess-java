public class Iphone15Order extends  ProductOrderTemplate{
    @Override
    protected Product getProduct() {
        return new Product("Apple");
    }
}
