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
        if (transactionCount <= FREE_TRANSACTIONS) {
            balance = balance - amount;
            transactionCount++;
        } else {
            balance = balance - amount - TRANSACTION_FEE;
            transactionCount++;
        }
    }



    public void deductFees() {
        if (transactionCount > FREE_TRANSACTIONS) {
            balance -= TRANSACTION_FEE;
        }
        transactionCount = 0;
    }

    public String toString() {
        return "Balance toString: The balance of Bank Account is $" + balance;
    }

    public static void main(String[] args) {

    }
}