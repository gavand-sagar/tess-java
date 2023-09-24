public class Mediator {
    private Brand brand;
    private  Product product;

    public Mediator(Brand brand, Product product) {
        this.brand = brand;
        this.product = product;
    }

    public  String getBrandName(){
        return  brand.getBrandName();
    }

//    public Brand getBrand() {
//        return brand;
//    }

    public Product getProduct() {
        return product;
    }
}
