package com.cts.d;

public class BankOperations {

	public static void main(String[] args) {

		/*
		 * Dependency Inversion Principle -The Dependency Inversion Principle (DIP)
		 * states that we should depend on abstractions (interfaces and abstract
		 * classes) instead of concrete implementations (classes). The abstractions
		 * should not depend on details; instead, the details should depend on
		 * abstractions.
		 */
		
		SavingsAccount savingsAccount =new SavingsAccount(1001, "Ram Gupta", 1000, 500);
		Bank bank =new Bank(savingsAccount);
		bank.deposit(200);
		bank.withdraw(100);
		bank.getBalance();
		
		CurrentAccount currentAccount=new CurrentAccount(1002, "Pooja Sharma", 2000, 500);
		Bank bank1=new Bank(currentAccount);
		bank1.deposit(300);
		bank1.withdraw(400);
		bank1.getBalance();
	}

}
