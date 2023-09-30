public class GoldCustomer  extends Customer{
    @Override
    int getDiscount() {
        return this.visitor.getGoldDiscount(this);
    }
}
