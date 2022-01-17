/**
 * Purse.java
 * @author Sangeeth
 * @since 1/17/2022
 * Calculates the total value of a purse of coins.
 * Precondition: The coins in the purse are pennies, nickels, dimes, and quarters.
 * Postcondition: The total value of the coins in the purse is returned.
 */

public class Purse {

    public static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.10;
    public static final double NICKEL_VALUE = 0.05; 

    // Define other fields needed 
    public double numQuarters; // number of quarters in the purse
    public double numDimes; // number of dimes in the purse
    public double numNickels; // number of nickels in the purse
    public double total; // total value of the purse

    // Include a default constructor that creates an empty purse.
    public Purse() {
        numQuarters = 0; // initialize the number of quarters in the purse
        numDimes = 0; // initialize the number of dimes in the purse
        numNickels = 0; // initialize the number of nickels in the purse
    }

    /**
     * Add the specified number of quarters to the purse.
     * @param numQuarters 
     */
    public void addQuarters(double numQuarters) {
        this.numQuarters += numQuarters; // add the specified number of quarters to the purse
        total += numQuarters * QUARTER_VALUE; // update the total value of the purse
    }
    /**
     * Add the specified number of dimes to the purse.
     * @param numDimes 
     */
    public void addDimes(double numDimes) {
        this.numDimes += numDimes; // add the specified number of dimes to the purse
        total += numDimes * DIME_VALUE; // update the total value of the purse
    }
    /**
     * Add the specified number of nickels to the purse.
     * @param numNickels
     */
    public void addNickels(double numNickels) {
        this.numNickels += numNickels; // add the specified number of nickels to the purse
        total += numNickels * NICKEL_VALUE; // update the total value of the purse
    }
    /**
     * Return the total value of the coins in the purse.
     * @return total value of coins in purse
     */
    public double getTotal() {
        total = (double) Math.round(total * 100) / 100; // round the total value of the purse to two decimal places
        return total; // return the total value of the purse
    }
}