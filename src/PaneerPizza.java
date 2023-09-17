public class PaneerPizza implements Pizza{

    private Pizza pizza;

    public PaneerPizza(Pizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public double getPrice() {
        return pizza.getPrice() + 30;
    }
}
