public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest() {
        deposit(getBalance() * interestRate);
    }

    public String toString() {
        return "Balance toString: The balance of Bank Account is $" + getBalance();
    }
    public static void main(String[] args) {

    }
}