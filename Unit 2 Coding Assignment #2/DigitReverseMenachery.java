// Sangeeth Menachery
// Exercise 2.6
// Use object and variables to reverse and output each number one by one

public class DigitReverseMenachery {
    private int num1;
    private int num2;


    public DigitReverseMenachery(int num3) {
    num1 = num3;
    }


    public int digit() {
      num2 = num1 % 10; 
      num1 /= 10;  
      System.out.println(num2); 
      return num1; 
    }

    public static void main(String[] args) {
        DigitReverseMenachery nums = new DigitReverseMenachery(12058);
        nums.digit();
        nums.digit();
        nums.digit();
        nums.digit();
        nums.digit();

    }
}
  
