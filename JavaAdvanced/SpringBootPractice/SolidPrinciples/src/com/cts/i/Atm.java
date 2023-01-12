package com.cts.i;

public class Atm {

	public static void main(String[] args) {

		/*
		 * Interface segregation principle - The Interface Segregation Principle (ISP)
		 * states that clients should not be forced to depend upon interface members
		 * they do not use. In other words, do not force any client to implement an
		 * interface that is irrelevant to them.
		 */

		BankAccount bankAccount = new BankAccount(1001, "Ram Gupta", 10000);
		bankAccount.deposit(200);
		bankAccount.withdraw(500);
		bankAccount.print();
	}

}
