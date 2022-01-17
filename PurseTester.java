/**
 * PurseTester.java
 * @author Sangeeth
 * @since 1/17/2022
 * Calculates the total value of a purse of coins.
 * Precondition: The coins in the purse are pennies, nickels, dimes, and quarters.
 * Postcondition: The total value of the coins in the purse is returned.
 */
public class PurseTester {
     /**
      * Main method is the starting of program
      * @param args
      */
     public static void main(String[] args) {
          Purse myPurse = new Purse();
          myPurse.addDimes(1); 
          myPurse.addQuarters(2);
          myPurse.addNickels(7);
          double totalValue = myPurse.getTotal();
          System.out.println("The total is " + totalValue); 
     }
}