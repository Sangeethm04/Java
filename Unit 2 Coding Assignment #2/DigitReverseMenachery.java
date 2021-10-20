// Sangeeth Menachery
// Exercise 2.6
// Use var to reverse and output each number one by one

public class DigitReverseMenachery {
    private int num1;
    private int num2;
    private int num3;


    public int digit(int num2) {
      num1 = num2 % 10;
      num2 = num2 / 10;  
      System.out.println(num1);
      return num2;
    }

    public static void main(String[] args) {
        DigitReverseMenachery nums = new DigitReverseMenachery();
        int number = nums.digit(12345);
        number = nums.digit(number);
        number = nums.digit(number);
        number = nums.digit(number);
        number = nums.digit(number);

    }
}
  
