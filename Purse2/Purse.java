public class Purse {
    // In this lab we will create a class called Purse that will compute the total value of a collection of coins (quarters, dimes, and nickels, NO pennies).  You will create the class Purse and the class PurseTester.  You must include all necessary Javadoc comments in both classes.  Use the partial class below to help you write the Purse class.  Submit screenshots of the two classes and the output when run to Google Classroom (3 screenshots total).
         private static final double QUARTER_VALUE = 0.25;
         private static final double DIME_VALUE = 0.1;
         private static final double NICKEL_VALUE = 0.05;
     
         // Define other fields needed 
            private double numQuarters;
            private double numDimes;
            private double numNickels;
            private double total;

         // Include a default constructor that creates an empty purse.
            public Purse()
            {
                numQuarters = 0;
                numDimes = 0;
                numNickels = 0;
            }    
         // Include a method addQuarters that adds quarters to the purse.
            public void addQuarters(double numberOfQuarters)
            {
                total += numberOfQuarters * QUARTER_VALUE;
            }
         // Include a method addDimes that adds dimes to the purse.
            public void addDimes(double numberOfDimes)
            {
                total += numberOfDimes * DIME_VALUE;
            }
         // Include a method addNickels that adds nickels to the purse.

            public void addNickels(double numberOfNickels)
            {
                total += numberOfNickels * NICKEL_VALUE;
            }
          /* Include a method getTotal that returns the total value of 
     the coins in the purse. */
            public double getTotal()
            {
                return total;
            }
    //end of Purse class
     
         public static void main(String[] args)
         {
              Purse myPurse = new Purse();
              myPurse.addDimes(1);
              myPurse.addQuarters(2);
              myPurse.addNickels(7);
              double totalValue = myPurse.getTotal();
              System.out.println("The total is " + totalValue);
         }
    }
