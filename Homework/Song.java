public class Song {
  // Create at least 1 method called verse that takes 2 parameters
  // that can be used to print out the verses of the song The Ants Go Marching
public void verse(String a, String b) {
  System.out.println("The ants go marching " + a + " by " + b);
  System.out.println("The little one stops to climb a tree");
}

  public static void main(String args[]) {
    // Create a Song object and call its method(s) to print out
    // the verses of The Ants Go Marching
    // There should be atleast 1 method called verse that takes 2 arguments.
    Song uno = new Song();
    uno.verse("three", "three");
  }

}