public abstract class Customer {

    public ProductVisitor visitor;
    public void accept(ProductVisitor visitor){
        this.visitor = visitor;
    }

    abstract int getDiscount();
}
