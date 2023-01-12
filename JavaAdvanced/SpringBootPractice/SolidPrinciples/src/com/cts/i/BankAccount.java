package com.cts.i;

public class BankAccount implements Account, PrintDetails{

	private int accountId;
	
	private String accountName;
	
	private double balance;
	
	
	public BankAccount(int accountId, String accountName, double balance) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.balance = balance;
	}
	
	

	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountName=" + accountName + ", balance=" + balance + "]";
	}



	@Override
	public void print() {
		System.out.println(this.toString());
		
	}

	@Override
	public void deposit(double balance) {
		this.balance =this.balance+balance;
		
	}

	@Override
	public void withdraw(double balance) {
		if(balance>this.balance) {
			System.out.println("Insufficient funds");
		}else {
			this.balance =this.balance-balance;
		}
		
	}

}
