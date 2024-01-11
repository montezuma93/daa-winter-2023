import players.Guitar;
import players.Guitarist;

public class Application {
    public static void main(String[] args) {

        Guitarist x = new Guitarist("Hans");
        Guitar guitar = new Guitar();
        x.setInstrument(guitar);
        x.play();
    }
}
