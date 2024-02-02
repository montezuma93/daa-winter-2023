package withoutfactory;

public class PizzaStore {

    void orderPizza(String pizzaType) {
        Pizza pizza = null;
        if(pizzaType == "Margarita") {
            pizza = new MargaritaPizza();
        } else if(pizzaType == "Pepperoni") {
            pizza = new PepperoniPizza();
        } else if(pizzaType == "Salami") {
            pizza = new SalamiPizza();
        } else {
            System.out.println("Diese Pizza hzben wir nicht");
        }
        pizza.prepare();
        pizza.back();

    }
}
