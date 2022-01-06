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
	 *  This version of isPalindrome will check pairs of letters. Each pair will consist of a letter from the beginning of the string and the corresponding place letter from the end of the string.  isPalindrome2 will return true if each pair has identical letters, false otherwise. Be efficient in writing this algorithm.

	 * */
	  public boolean isPalindrome2()
	  {
		  int i = 0;
		  int j = original.length() - 1;
		  while (i < j)
		  {
			  if (original.charAt(i) != original.charAt(j))
			  {
				  return false;
			  }
			  i++;
			  j--;
		  }
		  return true;
	  }
	
	 

	public static void main(String[] args) {
		WordMenachery uno = new WordMenachery("hannah");
		System.out.println("First String: " + uno.isPalindrome2());
		WordMenachery dos = new WordMenachery("rotor");
		System.out.println("Second String: " + dos.isPalindrome2());
	}
}
