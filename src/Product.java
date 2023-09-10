public class Product {
    public Product(){

    }
    public Product(String brand) {
        this.brand = brand;
    }

    public String brand;
    public void display(){
        System.out.println("Brand : " + this.brand);
    }

    public void order() {

    }
}
