package players;

public class Application {

    public static void main(String[] args)
    {
        Guitarist person1 = new Guitarist("Hermann", 30);
        Guitar guitar = new Guitar();
        person1.setInstrument(guitar);
        person1.play();
    }
}
