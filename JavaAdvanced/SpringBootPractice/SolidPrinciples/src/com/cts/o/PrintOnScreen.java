package com.cts.o;

public class PrintOnScreen implements PrintDetails {

	@Override
	public void printDetails(Account account) {
		System.out.println("Account Details ::"+account.toString());
		
	}

}
