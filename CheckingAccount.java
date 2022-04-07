<<<<<<< HEAD
public class CheckingAccount extends BankAccount {
    public void deposit(double amount) {
        super.deposit(amount);
    }
=======
<<<<<<< HEAD:Chapt9/Bank Account/CheckingAccountMenachery.java
public class CheckingAccountMenachery extends BankAccountMenachery {
=======
public class CheckingAccount extends BankAccount {
>>>>>>> parent of 7c889c3 (ev):CheckingAccount.java
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 2.0;

    public CheckingAccountMenachery(double initialBalance) {
        super(initialBalance);
        transactionCount = 0;
    }

    public void deposit(double amount) {
        transactionCount++;
        super.deposit(amount);
    }

    public void withdraw(double amount) {
        transactionCount++;
        super.withdraw(amount);
    }

    public void deductFees() {
        if (transactionCount > FREE_TRANSACTIONS) {
            super.withdraw(TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS));
        }
        transactionCount = 0;
    }

    public String toString() {
        return "Balance toString: The balance of Bank Account is $" + getBalance();
    }

    public static void main(String[] args) {

    }
>>>>>>> parent of 7c889c3 (ev)
}