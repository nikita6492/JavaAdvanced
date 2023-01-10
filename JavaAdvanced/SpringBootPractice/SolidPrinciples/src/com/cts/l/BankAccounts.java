package com.cts.l;

public class BankAccounts {

	public static void main(String[] args) {
		/*
		 * Liskov Substitution Principle - The Liskov Substitution Principle (LSP)
		 * applies to inheritance hierarchies such that derived classes must be
		 * completely substitutable for their base classes.
		 * 
		 */
		
		Account account =new SavingsAccount(1001, "Ram Sharma", 10000, 2000);
		account.depositMoney(500);
		account.withdrawMoney(9000);
		
		System.out.println("Savings Account Details::"+account.toString());
		
		Account account1 =new CurrentAccount(1002, "Pooja Gupta", 10000, 12000);
		account1.depositMoney(3000);
		account1.withdrawMoney(4000);
		
		System.out.println("Current Account Details::"+account1.toString());

	}

}
