package players;

public class Pianist extends Person implements MusicPlayer {

    Piano favoritePiano;

    Pianist(String name, int age) {
        super(name, age);
    }
    
    Pianist(String name) {
        super(name);
    }

    @Override
    public Instrument getInstrument() {
        return favoritePiano;
    }

    @Override
    public void setInstrument(Instrument instrument) {
        this.favoritePiano = (Piano) instrument;
    }

    @Override
    public void play() {
        System.out.println(favoritePiano.sound);
    }
}
