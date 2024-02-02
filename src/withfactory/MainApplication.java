package withfactory;

public class MainApplication {
    public static void main(String[] args) {

        PizzaFactory  pizzaFactory = new PizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
        pizzaStore.orderPizza("Margarita");
        pizzaStore.orderPizza("Margarita");
        pizzaStore.orderPizza("Pepperoni");
        pizzaStore.orderPizza("Salami");

    }
}
