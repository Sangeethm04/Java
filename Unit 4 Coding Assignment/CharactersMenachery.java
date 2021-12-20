//Sangeeth Menachery
//Exercise 4.3
//finding num of characters in a string

import java.util.Scanner;

public class CharactersMenachery {
    private String Stringinput;
    private char letterinput;
    private String indexes;

    public CharactersMenachery(String inputquote, char inputletter) {
        Stringinput = inputquote;
        letterinput = inputletter;
    }

    public int findCharacter() {
        int count = 0;
        for(int z = 1; z < Stringinput.length(); z++) {
            if (Stringinput.charAt(z) == letterinput) {
                count++;
            }

        }
        return count;
    }

    public String findIndex() {
        for(int b = 1; b < Stringinput.length(); b++) {
            if(Stringinput.charAt(b) == letterinput) {
                indexes += b + ",";
            }            
        }
        return indexes;
    }

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String inputquote = scan.nextLine();
    System.out.println("Enter a character: ");
    char inputletter = scan.next().charAt(0);
    CharactersMenachery first = new CharactersMenachery(inputquote, inputletter);
    System.out.println("The quote '" + inputquote + "' contains the letter '" + inputletter + "' " + first.findCharacter() + " time(s) at location(s): " + first.findIndex());
    System.out.println();
    }
}
