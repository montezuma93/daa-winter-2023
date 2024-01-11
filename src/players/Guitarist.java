package players;

public class Guitarist extends Person implements MusicPlayer {

    private Guitar favoriteGuitar;

    public Guitarist(String name) {
        super(name);
    }

    @Override
    public Instrument getInstrument() {
        return this.favoriteGuitar;
    }

    @Override
    public void setInstrument(Instrument instrument) {
        this.favoriteGuitar = (Guitar) instrument;
    }

    @Override
    public void play() {
        System.out.println(this.getInstrument().getSound());
    }
}
