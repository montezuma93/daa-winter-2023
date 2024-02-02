package observer;

public class Landwirt implements Observer {


    @Override
    public void update(float temperatur, float humidity) {
        if(temperatur <10) {
            System.out.println("Tiere in den Stall, es ist zu kalt");
        }
        if(humidity< 50) {
            System.out.println("Ich muss mal wieder gießen");

        }
    }

}
