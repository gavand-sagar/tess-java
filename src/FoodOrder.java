public class FoodOrder {
    private  OrderState state;

    public FoodOrder(OrderState state) {
        this.state = state;
    }

    public FoodOrder() {
        this.state = new OrderPlacedState();
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    void nextState(){
        this.state = state.next();
    }

    void showStatus(){
        this.state.currentStateInfo();
    }


}
