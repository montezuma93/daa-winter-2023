package oberver2;

public class CounterApp {

    public static void main(String[] args) {

        // Subject
        Counter counter = new Counter();
        // Observer
        CounterObserver counterObserver = new CounterObserver();

        // Observer registriert sich bei dem Subjekt
        counter.register(counterObserver);

        counter.increment();
        counter.increment();

        counter.decrement();

        counter.reset();

        counter.increment();

    }
}
