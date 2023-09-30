public class Product {

    private  Logger logger;

    public Product(Logger logger) {
        this.logger = logger;
    }

    public Product() {
    }

    void saveProduct(){


            this.logger.log("Error Occurred");

//        try{
//            new FileLogger().log("Error Occurred");
//        }catch (Exception e){
//            new ConsoleLogger().log("Error Occurred");
//        }


    }



}
