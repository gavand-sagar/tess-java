public class Brand {

    Mediator mediator;

    public Brand(String brandName) {
        this.brandName = brandName;
    }

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }


    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    private String brandName;
}
