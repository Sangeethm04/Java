// Sangeeth Menachery
// Exercise 2.5
// Use two nums for all values and object creation

public class PairMenachery {
    public double num1;
    public double num2;


    public PairMenachery(double nums1, double nums2) {
        num1 = nums1;
        num2 = nums2;
    }

    public Double getSum() {
        Double sum = num1 + num2;
        return sum;
    }
    public Double getDifference() {
        Double difference = num1 - num2;
        return difference;
    }
    public Double getProduct() {
        Double product = num1 * num2;
        return product;
    }
    public Double getAverage() {
        Double average = (num1 + num2)/2;
        return average;
    }
    public Double getDistance() {
        Double distance =  Math.abs(num1+num2);
        return distance;
    }
    public Double getMax() {
        Double max = Math.max(num1, num2);
        return max;
    }
    public Double getMin() {
        Double min = Math.min(num1, num2);
        return min;
    }
    public static void main(String[] args) {
        PairMenachery nums = new PairMenachery(5, 10);
        System.out.println("Sum - " + nums.getSum());
        System.out.println("Difference - " + nums.getDifference());
        System.out.println("Product - " + nums.getProduct());
        System.out.println("Average - " + nums.getAverage());
        System.out.println("Distance - " + nums.getDistance());
        System.out.println("Max - " + nums.getMax());
        System.out.println("Min - " + nums.getMin());
    }
}