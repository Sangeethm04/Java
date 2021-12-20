public class FunNumberMenachery {

	private int original;
	
	/* constructs a FunNumber with value num
	*/
	public void FunNumberMenachery(int num)
	{
   		original = num;
	}
 
	
	/* counts the digits in this FunNumber value
	 * @return the number of the digits
	 */
	public int numDigits()
	{
		int length = String.valueOf(original).length();
		return length;
	}
 
 
	/* sums the digits in this FunNumber value
	 * @return the sum of the digits
	 */
	public int sumDigits()
	{
		int sum = 0;
   		for(int x = 1; x < String.valueOf(original).length(); x++) {
			   sum = sum + Integer.parseInt(String.valueOf(original).substring(x, x+1));
		   } 
		   return sum;
	}
 
	
	/* creates a sum of the integers that are less than or equal to this FunNumber value
	 * @return the sum of the integers <= this FunNumber value
	 */
	public int sumInts()
	{
   	for(int y = 1; y < String.valueOf(original).length(); y++) {
		   
	   }
	}
 
 
	/* determines the factorial of this FunNumber value
	 * @return this FunNumber value's factorial
	 */
	public int findFactorial()
	{
   		// insert code
	}
	
	/* prints all of the factors of this FunNumber value
	 */
	public void printFactors()
	{
   		// insert code
	}
 
	
	/* determines if this FunNumber value is prime
	 * @return true if this value is prime, false otherwise
	 */
 	public boolean isPrime()
	{
   		// insert code
	}
 
	/* returns true if this FunNumber value is a "perfect" number 
	 * (a perfect number is a number that has a sum of proper factors equal to the value
 *  of this number. 6 is a perfect number because 6 = 1 + 2 + 3.)
	 * @ return true if this FunNumber value is a perfect number, false otherwise.
	 */
    public boolean isPerfect()
	{
   		// insert code
	}
	
 	/* returns a number that is the reverse of this FunNumber
 	 * @return reverse of this FunNumber
 	 */
	public int reverseNum()
    	{
    		// insert code
	}

	/* returns the value of this FunNumber
	 * @return value of this FunNumber
	 */
	public int getValue()
	{
   		return original;
	}

    public static void main(String[] args) {


    }
    }
