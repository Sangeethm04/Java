// BankAccount Class from Unit 2
// This is what we created in class together

public class BankAccount
{
   private double balance;
   
   public BankAccount()
   {
   }
   
   public BankAccount(double bal)
   {
      balance = bal;
   }
   
   public void deposit(double amount)
   {
      balance += amount;
   }
   
   public void withdraw(double amount)
   {
      balance -= amount;
   }
   
   public double getBalance()
   {
      return balance;
   }
   
   // Insert the main method
   public static void main(String[] args)
   {
      BankAccount bank = new BankAccount(50);
      BankAccount banks = new BankAccount();
      banks.withdraw(20000);
      banks.deposit(50000);
      System.out.println(banks.getBalance() + " balance.");
      bank.deposit(100);
      bank.withdraw(50);
      System.out.println(bank.getBalance() + " balance.");
   }
}