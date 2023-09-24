public class Product {
    Mediator mediator;
    public Product(){
    }

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }


    public Product(Mediator mediator) {
        this.mediator = mediator;
    }
    public void display(){
        System.out.println("Brand : " + this.mediator.getBrandName());
    }

}
