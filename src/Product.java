public class Product {
    public  static  int numberOfObjects = 0;

    public Product(String brand) {
        numberOfObjects++;
        this.brand = brand;
        System.out.println("Creating Product......");
        try{
            Thread.sleep(1000);
        }catch (Exception e){
        }
        System.out.println("Product Created.");
    }

    public String brand;
    public void display(){
        System.out.println("Brand : " + this.brand);
    }

    public void order() {

    }
}
