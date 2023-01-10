package com.cts.l;

public class SavingsAccount extends Account{

	private double minimumBalance;
	
	public SavingsAccount(int accountId, String name, double balance,double minimumBalance) {
		super(accountId, name, balance);
		this.minimumBalance=minimumBalance;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	@Override
	public void withdrawMoney(double money) {

		if (minimumBalance>balance-money) {
			System.out.println("Insufficient Balance cannot go below minimum balance");
		} else {
			balance = balance - money;
		}
	}
	

}
