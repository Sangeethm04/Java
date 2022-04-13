package Chapt9;
<<<<<<< HEAD
public class BankAccount {
    private double balance;
    public void deposit(double amount) {
        balance += amount;
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.deposit(100);
        System.out.println(account.getBalance());
    }
}
=======
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
>>>>>>> parent of 7c889c3 (ev)
