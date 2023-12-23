public class Sales implements  MyMenuItem{
    @Override
    public String getMenuName() {
        return "Sales";
    }

    @Override
    public void perform() {
        showSale();
    }

    private static void showSale() {
        System.out.println("Sales");
    }
}
