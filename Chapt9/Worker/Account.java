package Chapt9.Worker;
public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String toString() {
        return name + ", " + balance;
    }

    public boolean equals(Object other) {
        Account otherAccount = (Account) other;
        return (this.balance == otherAccount.balance) &&
            this.name.equals(otherAccount.name);
    }

    public static void main(String[] args) {
        Account acct1 = new Account("Armani Smith", 1500);
        System.out.println(acct1);
        SavingsAccount acct2 = new SavingsAccount("Dakota Jones", 1500, 4.5);
        SavingsAccount acct3 = new SavingsAccount("Dakota Jones", 1500, 4.5);
        System.out.println(acct2);
        System.out.println(acct2.equals(acct3));

    }
}
/* Write the SavingsAccount class which inherits from Account
   and has an interest rate and a constructor, toString, and
   equals methods.
*/
class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(double balance) {
        super(name, balance);
        this.interestRate = interestRate;
    }

    public String toString() {
        return super.toString() + ", " + interestRate;
    }

    public boolean equals(Object other) {
        SavingsAccount otherAccount = (SavingsAccount) other;
        return (this.interestRate == otherAccount.interestRate) &&
            super.equals(otherAccount);
    }
}