public class Product {
    public String brand;
    public String model;
    public String category;
    public int price;


    public  void display(){
        System.out.println("Product Details");
        System.out.println("=====================================================");
        System.out.println("Brand : " + this.brand);
        System.out.println("Model : " + this.model);
        System.out.println("Category : " + this.category);
        System.out.println("Price : " + this.price);
    }


}
