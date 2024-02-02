package oberver2;

import java.util.ArrayList;
import java.util.List;

// Subject
public class Counter implements Subject {

    List<Observer> observerList;

    Counter() {
        // leere oberserver liste
        observerList = new ArrayList<>();
    }

    private int count = 0;

    void increment() {
        count ++;
        notifyObservers();
    }

    void decrement() {
        count --;
        notifyObservers();
    }

    void reset() {
        count = 0;
        notifyObservers();
    }

    public int getCount() {
        return count;
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observerList) {
            o.update(getCount());
        }
    }

    @Override
    public void register(Observer o) {
        this.observerList.add(o);
    }
}
