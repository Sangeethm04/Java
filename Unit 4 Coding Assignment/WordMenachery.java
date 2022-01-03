//Sangeeth Menachery
//Exercise 4.1
//isPalindrome

public class WordMenachery {
	private String original;

	String newnew = "";
	char ch;

	/*
	 * constructs a Word with String value s
	 * 
	 * @param s is string value of Word
	 */
	public WordMenachery(String s) {
		original = s;
		reverse();
	}

	/*
	 * reverses letters in original string
	 * 
	 * @return a string that is a reverse of original
	 */
	public String reverse() {
		for (int i = 0; i <= original.length() - 1; i++) {
			ch = original.charAt(i);
			newnew = ch + newnew;
		}
		return newnew;
	}

	/*
	 * determines if word is a palindrome
	 * 
	 * @return true if word is a palindrome, false otherwise
	 */
	public boolean isPalindrome() {
		if (newnew.equalsIgnoreCase(original)) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Alternate method to determine if word is a palindrome
	 * 
	 * @return true if word is a palindrome, false otherwise
	 * */
	  public boolean isPalindrome2()
	  {
	    String reverse = "";
	    for (int i = original.length() - 1; i >= 0; i--)
	    {
	      reverse += original.charAt(i);
	    }
	    return reverse.equalsIgnoreCase(original);
	  }
	 

	public static void main(String[] args) {
		WordMenachery uno = new WordMenachery("Rotor");
		System.out.println("First String: " + uno.isPalindrome2());
		WordMenachery dos = new WordMenachery("Hello");
		System.out.println("Second String: " + dos.isPalindrome2());
	}
}
