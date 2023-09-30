public abstract class ProductVisitor {
    public abstract int getGoldDiscount(GoldCustomer customer);
    public abstract  int getSilverDiscount(SilverCustomer silverCustomer);
}
