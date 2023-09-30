public class XiaomiVisitor extends ProductVisitor{
    @Override
    public int getGoldDiscount(GoldCustomer customer) {
        return 10;
    }

    @Override
    public int getSilverDiscount(SilverCustomer silverCustomer) {
        return 10;
    }
}
