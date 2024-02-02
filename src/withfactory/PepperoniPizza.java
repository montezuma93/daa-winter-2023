package withfactory;

public class PepperoniPizza extends Pizza {

    @Override
    void prepare() {
        System.out.println("Belege Pizza Pepperoni mit Pepperoni und" +
                "Oliven und jalapenos");
    }

    @Override
    void back() {
        System.out.println("Backe Pepperoni Pizza besonders heiß");
    }
}
