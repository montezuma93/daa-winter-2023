package observer;

import players.Guitar;
import players.Guitarist;

public class Application {


    public static void main(String[] args) {

        WetterData wetterData = new WetterData();

        Landwirt landwirt = new Landwirt();
        wetterData.registerObserver(landwirt);

        Stadtmobil stadtmobil = new Stadtmobil();
        wetterData.registerObserver(stadtmobil);

        NASA nasa = new NASA();
        wetterData.registerObserver(nasa);

        wetterData.setMeasurements(20, 60);
        wetterData.setMeasurements(10, 40);
        wetterData.setMeasurements(0, 20);
        wetterData.setMeasurements(100, 20);


    }

}
