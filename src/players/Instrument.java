package players;

public abstract class Instrument {
    private String sound;

    Instrument(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
