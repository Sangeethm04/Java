<<<<<<< HEAD:SavingsAccountMenachery.java
public class SavingsAccountMenachery extends BankAccountMenachery {
=======
package Chapt9;
public class SavingsAccount extends BankAccount {
>>>>>>> 7c889c3e99813241b91b5349d0cf0684f624a73e:Chapt9/SavingsAccount.java
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