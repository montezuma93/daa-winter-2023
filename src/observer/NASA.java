package observer;

public class NASA implements Observer {
    @Override
    public void update(float temperatur, float humidity) {
        if(temperatur> 50) {
            System.out.println("i cant go to the moon");

        }
    }
}
