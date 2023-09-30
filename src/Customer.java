public class Customer {
    private TypeOfCustomer typeOfCustomer;
    public TypeOfCustomer getTypeOfCustomer() {
        return typeOfCustomer;
    }
    public void setTypeOfCustomer(TypeOfCustomer typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public Customer(TypeOfCustomer typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public Customer() {
        this.typeOfCustomer = new RegularCustomer();
    }

    void calculateDiscount(){
        if(this.typeOfCustomer !=null){
            System.out.println("Discount : " + this.typeOfCustomer.getDiscount() );
        }

    }

}
