public class OrderPlacedState extends  OrderState{
    @Override
    public OrderState next() {
        return new PreparingState();
    }

    @Override
    public void currentStateInfo() {
        System.out.println("Order Placed.");
    }
}
