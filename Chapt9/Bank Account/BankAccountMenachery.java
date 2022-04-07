<<<<<<< HEAD:Chapt9/Bank Account/BankAccountMenachery.java
public class BankAccountMenachery {
=======
public class BankAccount {
>>>>>>> parent of 7c889c3 (ev):BankAccount.java
   private double balance;

   public BankAccountMenachery() {
      balance = 0;
   }

   public BankAccountMenachery(double initialBalance) {
      balance = initialBalance;
   }

   public void deposit(double amount) {
      balance += amount;
   }

   public void withdraw(double amount) {
      balance -= amount;
   }

   public double getBalance() {
      return balance;
   }

   public void transfer(BankAccountMenachery other, double amount) {
      withdraw(amount);
      other.deposit(amount);
   }

   public String toString() {
      return "Balance toString: The balance of Bank Account is $" + balance;
   }
}