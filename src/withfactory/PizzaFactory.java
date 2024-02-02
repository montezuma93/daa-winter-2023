package withfactory;

public class PizzaFactory {

    Pizza createPizza(String pizzaType) {
        if(pizzaType == "Margarita") {
            return new MargaritaPizza();
        } else if(pizzaType == "Pepperoni") {
            return new PepperoniPizza();
        } else if(pizzaType == "Salami") {
            return new SalamiPizza();
        }
        else {
            System.out.println("Pizza kenne ich nicht");
            return null;
        }
    }

}
