package com.cts.s;

public class DepositMoney {

	private Account account;
	private double money;
	
	
	public DepositMoney(Account account, double money) {
		this.account = account;
		this.money = money;
	}


	public void depositMoney() {
		account.setBalance(account.getBalance()+money);
	}
}
