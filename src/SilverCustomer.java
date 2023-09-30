public class SilverCustomer extends Customer{
    @Override
    int getDiscount() {
        return this.visitor.getSilverDiscount(this);
    }
}
