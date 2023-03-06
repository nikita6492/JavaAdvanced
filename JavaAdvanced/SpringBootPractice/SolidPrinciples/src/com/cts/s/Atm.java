package com.cts.s;

public class Atm {

	public static void main(String[] args) {

		/*
		 * Single responsibility principle - instead of creating a single class with all
		 * the functionalities , create classes for each functionality. So each class
		 * has a single responsibility to fulfill Advantage- we only extend a particular
		 * class of required functionality for code reusability where it is required
		 */

		Account account1 = new Account(1001, "Ram Sharma", 1500);
		Account account2 = new Account(1002, "Pooja Gupta", 2000);

		DepositMoney depositMoney = new DepositMoney(account1, 100);
		depositMoney.depositMoney();

		WithdrawMoney withdrawMoney = new WithdrawMoney(account1, 200);
		withdrawMoney.withdrawMoney();

		PrintAccountDetails printAccountDetails = new PrintAccountDetails(account1);
		printAccountDetails.printAccountDetailsOnScreen();

		DepositMoney depositMoney2 = new DepositMoney(account2, 100);
		depositMoney2.depositMoney();

		WithdrawMoney withdrawMoney2 = new WithdrawMoney(account2, 200);
		withdrawMoney2.withdrawMoney();

		PrintAccountDetails printAccountDetails2 = new PrintAccountDetails(account2);
		printAccountDetails2.printAccountDetailsOnPaper();
		
		

	}

}
