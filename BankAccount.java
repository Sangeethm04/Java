// Bank Account Class for Chapter 10 Programming Projects

public class BankAccount {
   protected double balance;

   public BankAccount() {
      balance = 0;
   }

   public BankAccount(double initialBalance) {
      balance = initialBalance;
   }

   public void deposit(double amount) {
      balance = balance + amount;
   }

   public void withdraw(double amount) {
      balance = balance - amount;
   }

   public double getBalance() {
      return balance;
   }

   public void transfer(BankAccount other, double amount) {
      withdraw(amount);
      other.deposit(amount);
   }

   public String toString() {
      return "Balance toString: The balance of Bank Account is $" + balance;
   }
}