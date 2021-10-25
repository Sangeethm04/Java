// Sangeeth Menachery
// Exercise 2.6
// Use var to reverse and output each number one by one

public class DigitReverseMenachery {
    private int num1;
    private int num2;
    private int num3;
    

    public DigitReverseMenachery(int num3) {
    num1 = num3;
    }


    public int digit() {
      num1 = num1 % 10;
      num2 = num2 / 10;  
      System.out.println(num1);
      return num2;
    }

    public static void main(String[] args) {
        DigitReverseMenachery nums = new DigitReverseMenachery(12345);
        System.out.println(nums.digit());
        System.out.println(nums.digit());
        System.out.println(nums.digit());
        System.out.println(nums.digit());
        System.out.println(nums.digit());

    }
}
  
