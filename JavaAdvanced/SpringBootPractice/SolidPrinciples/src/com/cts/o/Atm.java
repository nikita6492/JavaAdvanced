package com.cts.o;

public class Atm {

	public static void main(String[] args) {

		/*
		 * Open closed Principle - a class is having functionalities which is doing
		 * similar kind of thing but in various forms like save - saving to a file,
		 * saving in db, saving in disk, saving in cache etc So if in future another
		 * kind of saving functionality comes we need to modify the class.
		 * 
		 * This principle states that ur class should be open for extension and closed
		 * for modification. So create interface , if any new functionality comes of
		 * similar type we will create a class implementing that interface and use it.
		 */

		Account account1 = new Account(1001, "Ram Sharma", 1500);
		Account account2 = new Account(1002, "Pooja Gupta", 2000);

		DepositMoney depositMoney = new DepositMoney(account1, 100);
		depositMoney.depositMoney();

		WithdrawMoney withdrawMoney = new WithdrawMoney(account1, 200);
		withdrawMoney.withdrawMoney();

		PrintDetails printDetails = new PrintOnScreen();
		printDetails.printDetails(account1);

		DepositMoney depositMoney2 = new DepositMoney(account2, 100);
		depositMoney2.depositMoney();

		WithdrawMoney withdrawMoney2 = new WithdrawMoney(account2, 200);
		withdrawMoney2.withdrawMoney();

		PrintDetails printDetails2 = new PrintOnFile();
		printDetails2.printDetails(account2);

	}

}
