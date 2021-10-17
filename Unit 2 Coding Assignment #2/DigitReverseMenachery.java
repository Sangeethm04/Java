// Sangeeth Menachery
// Exercise 2.6
// Use var to reverse and output each number one by one

public class DigitReverseMenachery {
    public String num1 = "123123";

    public String digit() {
       String individual = num1.substring(1,2);
        return individual;
    }
    public String digit2() {
       String individual = num1.substring(2,3);
        return individual;
    }
    public String digit3() {
       String individual = num1.substring(3,4);
        return individual;
    }
    public String digit4() {
       
       String individual = num1.substring(4,5);
        return individual;
    }
    public String digit5() {
       String individual = num1.substring(5);
        return individual;
    }
    public static void main(String[] args) {
        DigitReverseMenachery nums = new DigitReverseMenachery();
        System.out.println(nums.digit5());
        System.out.println(nums.digit4());
        System.out.println(nums.digit3());
        System.out.println(nums.digit2());
        System.out.println(nums.digit());
    }
}
  