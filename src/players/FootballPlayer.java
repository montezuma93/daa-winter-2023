package players;

public class FootballPlayer extends Person implements Sportsplayer {

    Football favoriteBall;

    FootballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public Sportstool getSportstool() {
        return favoriteBall;
    }

    @Override
    public void setSportstool(Sportstool tool) {
        this.favoriteBall = (Football) tool;
    }

    @Override
    public void play() {
        System.out.println(favoriteBall.sound);
    }
}
