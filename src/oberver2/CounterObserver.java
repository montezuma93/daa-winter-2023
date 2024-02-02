package oberver2;

import java.util.ArrayList;
import java.util.List;

public class CounterObserver implements Observer {

    List<Subject> subjectList;

    CounterObserver() {
        this.subjectList = new ArrayList<>();
    }

    @Override
    public void update(int count) {
        System.out.println("Something changed, value is" + count);
    }
}
