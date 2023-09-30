public class AppleVisitor extends ProductVisitor{
    @Override
    public int getGoldDiscount(GoldCustomer customer) {
        return 50;
    }

    @Override
    public int getSilverDiscount(SilverCustomer silverCustomer) {
        return 30;
    }
}
