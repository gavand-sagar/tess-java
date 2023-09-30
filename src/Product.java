public class Product {

    static int stock = 100;

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
