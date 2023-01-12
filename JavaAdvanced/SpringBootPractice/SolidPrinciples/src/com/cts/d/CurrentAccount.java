package com.cts.d;

public class CurrentAccount extends AccountInfo implements Account{

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
	public void deposit(double balance) {
		this.balance=this.balance+balance;
		
	}
	@Override
	public void withdraw(double balance) {
		if (-overdraftlimit>this.balance-balance) {
			System.out.println("Insufficient Balance cannot go beyond overdraft limit");
		} else {
			this.balance = this.balance - balance;
		}
		
	}
	@Override
	public void getBalance() {
		System.out.println(toString());
		
	}

}
