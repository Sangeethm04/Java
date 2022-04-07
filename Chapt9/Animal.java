package Chapt9;
public class Animal {
    private String animalType;
    private String species;
    private String name;

    public Animal(String animalType, String species, String name) {
        this.animalType = animalType;
        this.species = species;
        this.name = name;
    }

    public String toString() {
        return name + " the " + species + " is a " + animalType;
    }

    public static void main(String[] args) {
        Animal lisa = new Animal("carnivore", "lion", "Lisa");
        System.out.println(lisa.toString());
        Herbivore gary = new Herbivore("giraffe", "Gary");
        System.out.println(gary.toString());
        Elephant percy = new Elephant("Percy", 2.0);
        System.out.println(percy.toString());

    }
}