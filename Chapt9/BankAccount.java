package Chapt9;
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
