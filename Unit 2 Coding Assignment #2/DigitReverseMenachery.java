// Sangeeth Menachery
// Exercise 2.6
// Use var to reverse and output each number one by one

public class DigitReverseMenachery {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;
    private int num6;
    private int num7;

    public int digit(int num2) {
        num1 = num2;
        num3 = num1 % 10;
        num4 = num3 % 10;
        num5 = num4 % 10;
        num6 = num5 % 10;
      return num3;
    }

    public static void main(String[] args) {
        DigitReverseMenachery nums = new DigitReverseMenachery();
        System.out.println(nums.digit(12345));

    }
}
  