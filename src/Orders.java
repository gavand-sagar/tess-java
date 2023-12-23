public class Orders implements  MyMenuItem{
    @Override
    public String getMenuName() {
        return "Orders";
    }

    @Override
    public void perform() {
        showOrders();
    }

    private static void showOrders() {
        System.out.println("You are seeing orders now");
    }
}
