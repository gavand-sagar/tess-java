public class ProductBuilder {

    private  Product p;

    public ProductBuilder() {
        this.p = new Product();
    }

    public ProductBuilder withModel(String model){
        this.p.model = model;
        return this;
    }

    public ProductBuilder withCategory(String category){
        this.p.category = category;
        return this;
    }

    public ProductBuilder withPrice(int price){
        this.p.price = price;
        return this;
    }

    public ProductBuilder withBrand(String brand){
        this.p.brand = brand;
        return this;
    }

    public ProductBuilder asAppleMobile() {
        this.p.brand = "Apple";
        this.p.category = "Mobile";
        return this;
    }

    public Product build(){
     return  this.p;
    }

}
