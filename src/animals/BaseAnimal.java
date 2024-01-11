package animals;

// Basisklasse Tier
public class BaseAnimal implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Unbekannter Tierlaut");
    }
}
