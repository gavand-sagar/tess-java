public class PickupState extends OrderState{
    @Override
    public OrderState next() {
        return new DelieveredState();
    }

    @Override
    public void currentStateInfo() {
        System.out.println("Picked up.");
    }
}
