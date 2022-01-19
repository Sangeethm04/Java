public class TesterClass {
   // main method for testing
   public static void main(String[] args) {
      // Create 3 Pet objects and test all your methods
      Pet myPet = new Pet();
      myPet.getName();
      myPet.getAge();
      myPet.getWeight();
      myPet.getType();
      myPet.getBreed();
      System.out.println(myPet.toString());
      Pet myPet2 = new Pet("Bob", 2, 2.5, "Dog", "Lab");
      myPet2.getName();
      myPet2.getAge();
      myPet2.getWeight();
      myPet2.getType();
      myPet2.getBreed();
      System.out.println(myPet2.toString());
      Pet myPet3 = new Pet("Sally", 3, 3.5, "Cat", "Persian");
      myPet3.getName();
      myPet3.getAge();
      myPet3.getWeight();
      myPet3.getType();
      myPet3.getBreed();
      System.out.println(myPet3.toString());
   }
}