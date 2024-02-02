package withfactory;

public class MargaritaPizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("Belege Pizza Magaritha mit Käse und" +
                "Tomatensoße");
    }

    @Override
    void back() {
        System.out.println("Backe Magaritha Pizza");
    }
}
