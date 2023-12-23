public class Home implements  MyMenuItem{
    @Override
    public String getMenuName() {
        return "Home";
    }

    @Override
    public void perform() {
        showHome();
    }

    private static void showHome() {
        System.out.println("Welcome to home");
    }
}
