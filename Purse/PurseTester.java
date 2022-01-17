public class PurseTester {

    public static final double QUARTER_VALUE = 25;
    public static final double DIME_VALUE = 10;
    public static final double NICKEL_VALUE = 5;

    // Define other fields needed 
    public static double numQuarters;
    public static double numDimes;
    public static double numNickels;
    public double total;


    // Include a default constructor that creates an empty purse.
    public PurseTester() {
        numQuarters = 0;
        numDimes = 0;
        numNickels = 0;
    }
    // Include a method addQuarters that adds quarters to the purse.
    public void addQuarters(double numberOfQuarters) {
        total += numberOfQuarters * QUARTER_VALUE;
        System.out.println(total);
    }

    // Include a method addDimes that adds dimes to the purse.
    public void addDimes(double numberOfDimes) {
        total = total +  (numberOfDimes * DIME_VALUE);
        System.out.println(total);
    }
    // Include a method addNickels that adds nickels to the purse.
    public void addNickels(double numberOfNickels) {
        total += numberOfNickels * NICKEL_VALUE;
        System.out.println(total);
    }
    /* Include a method getTotal that returns the total value of 
 the coins in the purse. */
    public double getTotal() {
       return total;
    }
    public static void main(String[] args) {
        Purse myPurse = new Purse();
        myPurse.addDimes(0);
        myPurse.addQuarters(5);
        myPurse.addNickels(0);
        double totalValue = myPurse.getTotal();
        System.out.println("The total is " + totalValue);
    }
}