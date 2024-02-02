package withoutfactory;

public class MainApplication {
    public static void main(String[] args) {

        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("Margarita");
        pizzaStore.orderPizza("Margarita");
        pizzaStore.orderPizza("Pepperoni");
        pizzaStore.orderPizza("Salami");

    }
}
