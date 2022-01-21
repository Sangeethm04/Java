/**
    Pet class (complete comments)
    @author Sangeeth   
    @since 1/18/2022

*/
public class Pet {
    // keep track of the name, age, weight, type of animal, and breed of the pet
    private String name;
    private int age;
    private double weight;
    private String type;
    private String breed;

    // Write 2 constructors, accessor (get) methods, and a toString method. Use good commenting.
    
    public Pet() {
        name = "";
        age = 0;
        weight = 0.0;
        type = "";
        breed = "";
    }
    public Pet(String name, int age, double weight, String type, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.type = type;
        this.breed = breed;
    }
    /**
     * getName method
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * getAge method
     * @return age
     */
    public int getAge() {
        return age;
    }
    /**
     * getWeight method
     * @return weight
     */
    public double getWeight() {
        return weight;
    }
    /**
     * getType method
     * @return type
     */
    public String getType() {
        return type;
    }
    /**
     * getBreed method
     * @return breed
     */
    public String getBreed() {
        return breed;
    }
    /**
     * toString method
     * @return String
     */
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nWeight: " + weight + "\nType: " + type + "\nBreed: " + breed;
    }
}