// Add three variables
// transactionCount - keeps track of the number of transactions for each object.
// private static final int FREE_TRANSACTIONS = 3; to set the number of transactions you won’t get charged for.
// private static final double TRANSACTION_FEE = 2.0; to set the fee for each transaction over the FREE_TRANSACTION amount.
// The constructor should take in an initial balance as a parameter.  You should not be able to start a checking account with a zero balance.
// Override the deposit and withdraw methods while keeping track of the number of transactions.
// Create a method deductFees that calculates any fees, updates the balance, and sets the transaction count back to zero.  This method is type void.
// Create a toString method.

public class CheckingAccount extends BankAccount {
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 2.0;

    public CheckingAccount() {
        transactionCount = 0;
    }

    public CheckingAccount(double initialBalance) {
        if (initialBalance > 0) {
            transactionCount = 0;
            balance = initialBalance;
        }
    }
    //Override the deposit and withdraw methods while keeping track of the number of transactions.

    public void deposit(double amount) {
        transactionCount++;
        balance += amount;
    }

    public void withdraw(double amount) {
        if (transactionCount < FREE_TRANSACTIONS) {
            if (balance - amount >= 0) {
                balance = balance - amount;
                transactionCount++;
            }
        } else {
            if (balance - amount - TRANSACTION_FEE >= 0) {
                balance = balance - amount - TRANSACTION_FEE;
                transactionCount++;
            }
        }
    }

    public void deductFees() {
        if (transactionCount > FREE_TRANSACTIONS) {
            balance = balance - TRANSACTION_FEE;
        }
        transactionCount = 0;
    }

    public String toString() {
        return "Balance toString: The balance of Bank Account is $" + balance;
    }

    public static void main(String[] args) {

    }
}