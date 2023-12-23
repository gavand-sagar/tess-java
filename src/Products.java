public class Products implements  MyMenuItem{
    @Override
    public String getMenuName() {
        return "Products";
    }

    @Override
    public void perform() {
        showProducts();
    }

    private static void showProducts() {
        System.out.println("All products listed here");
    }
}
