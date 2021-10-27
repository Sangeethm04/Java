import java.util.Scanner;  // Imports the Scanner class

public class GuessingGame {
	public static void main(String[] args) {
		//Create a Scanner object to get input
Scanner input = new Scanner(System.in);

//Create random number and get user’s guess
int x = (int)((Math.random() * 11) + 1);//Random method 
System.out.println("Guess a number between 1 and 10.");
int guess = input.nextInt();

//Use an if-else statement to check to see if there guess was correct
// and print to screen for either case
if (guess == x) {
    System.out.println("Correct");
	//Add an output that shows the players guess and the generated number.
} else {
    System.out.println("Incorrect");
}
}
}

