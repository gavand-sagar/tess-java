public class PreparingState extends OrderState{
    @Override
    public OrderState next() {
        return new PickupState();
    }

    @Override
    public void currentStateInfo() {
        System.out.println("Preparing");
    }
}
