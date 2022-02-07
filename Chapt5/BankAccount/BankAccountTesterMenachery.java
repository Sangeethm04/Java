// package Chapt5.BankAccount;

// /**
//  * BankAccountTesterMenachery.java
//  * @author Sangeeth Menachery
//  * @since 1/24/2022
//  * This program is a fake bank account program.
//  * Preconditions: the name, account number, and balance must be valid.
//  * Postconditions: the name, account number, and balance are set to the values passed in.
//  */
// public class BankAccountTesterMenachery {
//     /**
//      * runs the tester file for BankAccountMenachery class
//      * @param args
//      */
//     public static void main(String[] args) {
//         BankAccountMenachery bank1 = new BankAccountMenachery();
//         bank1.toString();
//         BankAccountMenachery bank2 = new BankAccountMenachery("Bob", "12345", 100.0);
//         bank2.deposit(500.0);
//         bank2.withdrawal(50.0);
//         System.out.println(bank2.getName());
//         System.out.println(bank2.getAccountNumber());
//         System.out.println(bank2.getBalance());
//         System.out.println(bank2.toString());
//     }
// }