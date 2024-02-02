package oberver2;

public interface Subject {

    void notifyObservers();

    void register(Observer o);
}
