// get product,
// add to cart,
// checkout
public abstract class ProductOrderTemplate {

    public final void order(){
        Product p = this.getProduct();
        addToCart(p);
        Checkout(p);
        updateStock(p);
    }
    protected abstract Product getProduct();
    private void addToCart(Product p){
        System.out.println("Added to Cart");
        p.display();
    }
    private void Checkout(Product p){
        System.out.println("Checked Out" + p.brand);
    }

    private void updateStock(Product p){
        Product.stock--;
    }

}
