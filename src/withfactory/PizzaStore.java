package withfactory;

public class PizzaStore {

    PizzaFactory pizzaFactory;

    PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    void orderPizza(String pizzaType) {
       Pizza pizza = pizzaFactory.createPizza(pizzaType);
       pizza.prepare();
       pizza.back();

    }
}
