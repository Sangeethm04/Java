// package Chapt5;
// public class BankAccount {
//     private String name;
//     private double accountNumber;
//     private double balance;

    
//     public BankAccount(String name, double accountNumber, double balance) {
//         this.name = name;
//         this.accountNumber = accountNumber;
//         this.balance = balance;
//     }

//     public BankAccount() {
//         this.name = "";
//         this.accountNumber = 0;
//         this.balance = 0;
//     }

//     public String toString() {
//         return "Name: " + this.name + "\nAccount Number: " + this.accountNumber + "\nBalance: " + this.balance;
//     }

//     public void deposit(double amount) {
//         this.balance += amount;
//     }

//     public void withdraw(double amount) {
//         this.balance -= amount;
//     }

//     public static void main(String[] args) {
//         BankAccount account = new BankAccount();
//         account.name = "John Doe";
//         account.accountNumber = 123456789;
//         account.balance = 100;
//         System.out.println(account);
//         account.deposit(50);
//         System.out.println(account);
//         account.withdraw(25);
//         System.out.println(account);
//     }
// }
