public class SamsungVisitor extends ProductVisitor{
    @Override
    public int getGoldDiscount(GoldCustomer customer) {
        return 60;
    }

    @Override
    public int getSilverDiscount(SilverCustomer silverCustomer) {
        return 40;
    }
}
