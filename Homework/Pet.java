// /**
//     Pet class (complete comments)
//     @author Sangeeth   
//     @since 1/18/2022

// */
// // Create a Pet class that keeps track of the name, age, weight, type of animal, and breed for records at an animal clinic with 2 constructors, accessor (get) methods, a toString method, and mutator (set) methods for each instance variable.

// public class Pet {
//     // keep track of the name, age, weight, type of animal, and breed of the pet
//     private String name;
//     private int age;
//     private double weight;
//     private String type;
//     private String breed;

//     // Write 2 constructors, accessor (get) methods, and a toString method. Use good commenting.

//     public Pet() {

//     }
//     public Pet(String name, int age, double weight, String type, String breed) {
//         this.name = name;
//         this.age = age;
//         this.weight = weight;
//         this.type = type;
//         this.breed = breed;
//     }
//     /**
//      * getName method
//      * @return name
//      */
//     public String getName() {
//         return name;
//     }
//     /**
//      * getAge method
//      * @return age
//      */
//     public int getAge() {
//         return age;
//     }
//     /**
//      * getWeight method
//      * @return weight
//      */
//     public double getWeight() {
//         return weight;
//     }
//     /**
//      * getType method
//      * @return type
//      */
//     public String getType() {
//         return type;
//     }
//     /**
//      * getBreed method
//      * @return breed
//      */
//     public String getBreed() {
//         return breed;
//     }
//     /**
//      * setName method
//      * @param name
//      */
//     public void setName(String name) {
//         this.name = name;
//     }
//     /**
//      * setAge method
//      * @param age
//      */
//     public void setAge(int age) {
//         this.age = age;
//     }
//     /**
//      * setWeight method
//      * @param weight
//      */
//     public void setWeight(double weight) {
//         this.weight = weight;
//     }
//     /**
//      * setType method
//      * @param type
//      */
//     public void setType(String type) {
//         this.type = type;
//     }
//     /**
//      * setBreed method
//      * @param breed
//      */
//     public void setBreed(String breed) {
//         this.breed = breed;
//     }
//     /**
//      * toString method
//      * @return String
//      */
//     public String toString() {
//         return "Name: " + name + "\nAge: " + age + "\nWeight: " + weight + "\nType: " + type + "\nBreed: " + breed;
//     }
// }
// class TesterClass {
//     // main method for testing
//     public static void main(String[] args) {
//         // Create 3 Pet objects and test all your methods
//         Pet myPet = new Pet();
//         System.out.println(myPet);
//         Pet myPet2 = new Pet("Bob", 2, 2.5, "Dog", "Lab");
//         System.out.println(myPet2);
//         Pet myPet3 = new Pet("Sally", 3, 3.5, "Cat", "Doodle");
//         System.out.println(myPet3);
//         myPet3.setName("Sally");
//         myPet3.setAge(3);
//         myPet3.setWeight(3.5);
//         myPet3.setType("Cat");
//         myPet3.setBreed("Doodle");
//     }
// }