import java.util.Scanner;

public class GuessingGame 
{
  public static void main(String[] args) 
  {
    try (Scanner scan = new Scanner(System.in)) {
      // Choose a random number from 0-100 
 int rand = (int)(Math.random() * 100);
       // Ask the user to guess a number from 0 to 100 
       System.out.println("Guess a number between 0 to 100");
       // Get the first guess using scan.nextInt();
 int guess = scan.nextInt();


       // Loop while the guess does not equal the random number,
while (guess != rand) 
         // If the guess is less than the random number, print out "Too low!"
         {
            if (guess < rand)
            {
                System.out.println("Too low!");
            }
       
          // If the guess is greater than the random number, print out "Too high!"
        if (guess > rand) {
            System.out.println("Too high");
        }
          // Get a new guess (save it into the same variable)
        guess = scan.nextInt();

      
 }
    }
   // Print out something like "You got it!"
    System.out.println("You got it!");
  }
}