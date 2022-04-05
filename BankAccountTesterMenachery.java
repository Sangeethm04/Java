public class BankAccountTesterMenachery {
	public static void main(String[] args) {

		SavingsAccountMenachery test1 = new SavingsAccountMenachery(5);
		test1.deposit(1000);
		test1.addInterest();
		test1.addInterest();
		System.out.println("Test1 balance should be $1102.50, and it is " + test1.getBalance());
		System.out.println(test1);


		BankAccountMenachery test2 = new BankAccountMenachery(2);
		test2.deposit(5000);
		System.out.println("\nTest2 balance should be $5000, and it is " + test2.getBalance());	//should be $5002 which is an error
		System.out.println(test2);


		CheckingAccountMenachery test3 = new CheckingAccountMenachery(10000);
		test3.deposit(1000);
		test3.withdraw(3000);
		test3.withdraw(200);
		System.out.println("\nTest3 balance should be $7800, and it is " + test3.getBalance());
		test3.deductFees();
		System.out.println("\nTest3 balance should still be $7800, and it is " + test3.getBalance());
		test3.deposit(3000);
		test3.withdraw(30);
		test3.withdraw(800);
		test3.deposit(1000);
		test3.withdraw(50);
		test3.withdraw(500);
		System.out.println("\nTest3 balance should now be $10420, and it is " + test3.getBalance());
		test3.deductFees();
		System.out.println("\nTest3 balance should now be $10414, and it is " + test3.getBalance());
		System.out.println(test3);

		//Initialy had wrong object delcaration for test4, but it was fixed, the sub class should go in right before the parameter not the parent class
		CheckingAccountMenachery test4 = new CheckingAccountMenachery(4000);
		test4.withdraw(1000);
		test4.withdraw(1000);
		test4.withdraw(1000);
		test4.withdraw(1000);
		test4.deductFees();
		System.out.println("\nTest4 balance should be $-2, and it is " + test4.getBalance());
		System.out.println(test4);

	}
}