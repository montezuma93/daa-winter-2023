package observer;

import java.util.ArrayList;
import java.util.List;

public class WetterData2 implements Subject {

    float temperature;
    float humidity;

    List<Observer> observers;

    public WetterData2() {
        observers = new ArrayList<>();
    }

    void setMeasurements(float temperature, float humidity) {
        System.out.println("Neue Wetterdaten liegen vor");
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(temperature, humidity);
        }
    }
}
