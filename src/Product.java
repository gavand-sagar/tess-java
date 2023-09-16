public class Product implements Cloneable {

    public User author;

    @Override
    protected Product clone() throws CloneNotSupportedException{
        Product p = (Product)super.clone();
        p.author = new User();
        return p;
        //return (Product)super.clone();
    }


    private Product(){

    }
    public Product(String brand) {
        //calling database and taking long time
        this.discount = 10; /// getting from database
        this.brand = brand;
        this.author = new User();

    }
    public int discount;
    public String brand;
    public void display(){
        System.out.println(" { Brand : " + this.brand + ", Author: " + this.author.name +"}");
    }

    public void order() {

    }
}
