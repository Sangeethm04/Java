public class Purse {

    public static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.10;
    public static final double NICKEL_VALUE = 0.05;

    // Define other fields needed 
    public double numQuarters;
    public double numDimes;
    public double numNickels;
    public double total;

    // Include a default constructor that creates an empty purse.
    public Purse() {
        numQuarters = 0;
        numDimes = 0;
        numNickels = 0;
    }

    /**
     * Add the specified number of quarters to the purse.
     * @param numQuarters
     */
    public void addQuarters(double numQuarters) {
        this.numQuarters += numQuarters;
        total += numQuarters * QUARTER_VALUE;
    }
    /**
     * Add the specified number of dimes to the purse.
     * @param numDimes
     */
    public void addDimes(double numDimes) {
        this.numDimes += numDimes;
        total += numDimes * DIME_VALUE;
    }
    /**
     * Add the specified number of nickels to the purse.
     * @param numNickels
     * 
     */
    public void addNickels(double numNickels) {
        this.numNickels += numNickels;
        total += numNickels * NICKEL_VALUE;
    }
    /**
     * Return the total value of the coins in the purse.
     * @return
     */
    public double getTotal() {
        total = (double) Math.round(total * 100) / 100;
        return total;
    }
    //end of Purse class
}