<<<<<<< HEAD:Chapt9/Bank Account/SavingsAccountMenachery.java
public class SavingsAccountMenachery extends BankAccountMenachery {
=======
public class SavingsAccount extends BankAccount {
>>>>>>> parent of 7c889c3 (ev):SavingsAccount.java
    private double interestRate;

    public SavingsAccountMenachery(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest() {
        super.deposit(getBalance() * (1 + (interestRate / 100)));
    }

    public String toString() {
        return "Balance toString: The balance of Bank Account is $" + getBalance();
    }
    public static void main(String[] args) {

    }
}