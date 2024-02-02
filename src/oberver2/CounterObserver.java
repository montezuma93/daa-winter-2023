package oberver2;

public class CounterObserver implements Observer {
    @Override
    public void update(int count) {
        System.out.println("Something changed, value is" + count);
    }
}
