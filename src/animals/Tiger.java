package animals;

// Klasse Tiger, die von BaseAnimal erbt
public class Tiger extends BaseAnimal {
    // Hier wird die Methode überschrieben
    @Override
    public void makeSound() {
        System.out.println("Brüllender Tiger");
    }
}