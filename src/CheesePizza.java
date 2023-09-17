public class CheesePizza implements Pizza{
    private  Pizza pizza;
    public CheesePizza(Pizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public double getPrice() {
        return pizza.getPrice() + 50;
    }
}
