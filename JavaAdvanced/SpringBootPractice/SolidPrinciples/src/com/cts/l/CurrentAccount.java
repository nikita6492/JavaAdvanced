package com.cts.l;

public class CurrentAccount extends Account{

	private double overdraftlimit;
	public CurrentAccount(int accountId, String name, double balance, double overdraftlimit) {
		super(accountId, name, balance);
		this.overdraftlimit=overdraftlimit;
	}
	public double getOverdraftlimit() {
		return overdraftlimit;
	}
	public void setOverdraftlimit(double overdraftlimit) {
		this.overdraftlimit = overdraftlimit;
	}
	
	@Override
	public void withdrawMoney(double money) {

		if (-overdraftlimit>balance-money) {
			System.out.println("Insufficient Balance cannot go beyond overdraft limit");
		} else {
			balance = balance - money;
		}
	}

}
