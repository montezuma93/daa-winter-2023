package players;

public class Guitarist extends Person implements MusicPlayer {

    Guitar favoriteGuitar;

    Guitarist(String name, int age) {
        super(name, age);
    }

    @Override
    public Instrument getInstrument() {
        return favoriteGuitar;
    }

    @Override
    public void setInstrument(Instrument instrument) {
        this.favoriteGuitar = (Guitar) instrument;
    }

    @Override
    public void play() {

    }
}

