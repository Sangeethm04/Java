public class Purse {
    private static final double QUARTER_VALUE = 0.25;
    private static final double DIME_VALUE = 0.1;
    private static final double NICKEL_VALUE = 0.05;

    // Define other fields needed 
    private static int numQuarters;
    private static int numDimes;
    private static int numNickels;
    private static double total;


    // Include a default constructor that creates an empty purse.
    public Purse() {
        numQuarters = 5;
        numDimes = 0;
        numNickels = 0;
    }
    // Include a method addQuarters that adds quarters to the purse.
    public void addQuarters(int numberOfQuarters) {
        total += numberOfQuarters * QUARTER_VALUE;
        System.out.println(total);
    }

    // Include a method addDimes that adds dimes to the purse.
    public void addDimes(int numberOfDimes) {
        total += numberOfDimes * DIME_VALUE;
        System.out.println(total);
    }
    // Include a method addNickels that adds nickels to the purse.
    public void addNickels(int numberOfNickels) {
        total += numberOfNickels * NICKEL_VALUE;
        System.out.println(total);
    }
    /* Include a method getTotal that returns the total value of 
 the coins in the purse. */
    public void getTotal() {
       //return total;
    }
} //end of Purse class