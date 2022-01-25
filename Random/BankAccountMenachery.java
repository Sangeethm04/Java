// BankAccount Class from Unit 2
// This is what we created in class together

public class BankAccountMenachery
{
   private double balance;
   
   public BankAccountMenachery()
   {
   }
   
   public BankAccountMenachery(double bal)
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
      BankAccountMenachery bank = new BankAccountMenachery(50);
      BankAccountMenachery banks = new BankAccountMenachery();
      banks.withdraw(20000);
      banks.deposit(50000);
      System.out.println(banks.getBalance() + " balance.");
      bank.deposit(100);
      bank.withdraw(50);
      System.out.println(bank.getBalance() + " balance.");
   }
}