package observer;

public class Stadtmobil implements Observer {

    @Override
    public void update(float temperatur, float humidity) {
        if(temperatur <5) {
            System.out.println("Winterreifen anziehen");
        }
    }

}
