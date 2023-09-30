public class DelieveredState extends OrderState{
    @Override
    public OrderState next() {
        return null;
    }

    @Override
    public void currentStateInfo() {
        System.out.println("Delivered.");
    }
}
