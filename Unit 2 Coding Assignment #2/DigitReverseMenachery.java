// Sangeeth Menachery
// Exercise 2.6
// Use var to reverse and output each number one by one

public class Main {
    private int num1;
    private int num2;
    private int num3;


    public int digit(int num2) {
    num1 = num2 % 10; // 5
    num2 = num2 / 10;  //1234
    System.out.println(num1); // 5
    return num2; //1234
    }

    public static void main(String[] args) {
        Main nums = new Main();
        int number = nums.digit(12345);
        number = nums.digit(number); //1234
        number = nums.digit(number);
        number = nums.digit(number);
        number = nums.digit(number);

    }
}
  
