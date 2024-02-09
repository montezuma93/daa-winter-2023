package datenstructur;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Animal("löwe", "bernd", 12, "male");
        animals[1] = new Animal("giraffe", "hermann", 30, "male");
        animals[2] = new Animal("elefant", "rosa", 1, "female");

        getAnimalsByGender(animals, "male");
        getAnimalsByAgeRange(animals, 4, 24);
    }

    public static void getAnimalsByGender(Animal[] animals, String gender) {
        for(Animal animal : animals) {
            if(animal.gender == gender){
                System.out.println(animal.name);
            }
        }
    }

    public static void getAnimalsByAgeRange(Animal[] animals, int minAge, int maxAge) {
        for(Animal animal : animals) {
            if(animal.age > minAge && animal.age < maxAge){
                System.out.println(animal.name);
            }
        }
    }
}
