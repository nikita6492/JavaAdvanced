package com.cts.l;

public class Account {

	protected int accountId;
	protected String name;
	protected double balance;

	public Account(int accountId, String name, double balance) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdrawMoney(double money) {

		if (money > balance) {
			System.out.println("Insufficient Balance");
		} else {
			balance = balance - money;
		}
	}

	public void depositMoney(double money) {

		balance=balance+money;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", name=" + name + ", balance=" + balance + "]";
	}

}
