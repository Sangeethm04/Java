public class NumberSystem

{
    /** Precondition: a and b are positive integers.
     * Returns the greatest common factor of a and b, as described in part (a).
     */

    public static int gcf(int a, int b)

    {
        if (a % b == 0) {
            return b;
        } else {
            return gcf(b, a % b);
        }

         
    }

    /** Precondition: numerator and denominator are positive integers.
     * Reduces the fraction numerator / denominator
     * and prints the result, as described in part (b).
     */

    public static void reduceFraction(int numerator, int denominator)

    {
        int gcf = gcf(numerator, denominator);
        System.out.println(numerator / gcf + "/" + denominator / gcf);
    }

    public static void main(String[] args) {
        System.out.println(gcf(3, 30));
        reduceFraction(3, 30);
    }

}