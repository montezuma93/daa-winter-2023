package players;

public class Guitarist extends Person implements MusicPlayer {

    Guitarist(String name, int age) {
        super(name, age);
    }

    @Override
    public Instrument getInstrument() {
        return null;
    }

    @Override
    public void setInstrument(Instrument instrument) {

    }

    @Override
    public void play() {

    }
}
