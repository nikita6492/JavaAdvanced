package com.cts.d;

public class SavingsAccount extends AccountInfo implements Account{

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
	public void deposit(double balance) {
		this.balance=this.balance+balance;
		
	}

	@Override
	public void withdraw(double balance) {
		if (minimumBalance>this.balance-balance) {
			System.out.println("Insufficient Balance cannot go below minimum balance");
		} else {
			this.balance = this.balance - balance;
		}
		
	}

	@Override
	public void getBalance() {
		System.out.println(toString());
		
	}
	

}
