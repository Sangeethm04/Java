/**
 * BankAccountMenachery.java
 * @author: Sangeeth Menachery
 * @since: 1/24/2022
 * This program is a fake bank account program.
 * Preconditions: the name, account number, and balance must be valid.
 * Postconditions: the name, account number, and balance are set to the values passed in.
 */

public class BankAccountMenachery {
    private String name; // keeps track of the name of the account holder
    private String accountNumber; // keeps track of the account number
    private double balance; // keeps track of the balance

    public BankAccountMenachery() {
        name = ""; // sets the name to an empty string
        accountNumber = "00000"; // sets the account number to a default value
        balance = 0.0; // sets the balance to 0.0
    }

    public BankAccountMenachery(String name, String accountNumber, double balance) {
        this.name = name; // sets the name to the parameter
        this.accountNumber = accountNumber; // sets the account number to the parameter
        this.balance = balance; // sets the balance to the parameter
    }
    /**
     * takes money away from the account
     * @param amount the amount to deposit
     */
    public void withdrawal(double amount) {
        balance -= amount;
    }
    /**
     * deposits money into the account
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        balance += amount;
    }
    /**
     * returns the name of the account holder
     * @return the name of the account holder
     */
    public String getName() {
        return name;
    }
    /**
     * returns the account number
     * @return the account number
     */
    public String getAccountNumber() {
        return accountNumber;
    }
    /**
     * returns the balance
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }
    /**
     * returns a string of the account
     * @return a string of the account
     */
    public String toString() {
        return "Name: " + name + "\nAccount Number: " + accountNumber + "\nBalance: " + balance;
    }

}