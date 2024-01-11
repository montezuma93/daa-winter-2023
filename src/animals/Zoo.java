package animals;

// Aufgabe: Füge etwas hinzu, damit die Klasse Lion "Knurrender Löwe" ausgibt
public class Zoo {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        // Hier sollte "Brüllender Tiger" ausgegeben werden
        tiger.makeSound();

        // Hier sollte "Knurrender Löwe" ausgegeben werden
        lion.makeSound();
    }
}
