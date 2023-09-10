public class Product {
    private Product(){

    }

    private static Product p;
    public static  Product createProduct(){
        if(p == null){
            p = new Product();
            return p;
        }else{
            return p;
        }
    }


    public String brand;

    public void display(){
        System.out.println("Brand : " + this.brand);
    }

    public void order() {

    }
}
