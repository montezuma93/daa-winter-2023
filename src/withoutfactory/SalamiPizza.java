package withoutfactory;

public class SalamiPizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("Salami Pizza belegen mit Salami");
    }

    @Override
    void back() {
        System.out.println("Salami Pizza backen");
    }
}
