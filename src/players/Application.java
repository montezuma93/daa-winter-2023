package players;

public class Application {

    public static void main(String[] args)
    {
        System.out.println("hello");

        Guitarist person1 = new Guitarist("Hermann", 30);
        Guitar guitar = new Guitar();
        person1.setInstrument(guitar);
        person1.play();

        Pianist pianist = new Pianist("Philip", 36);
        Piano piano = new Piano();
        pianist.setInstrument(piano);
        pianist.play();
    }
}
