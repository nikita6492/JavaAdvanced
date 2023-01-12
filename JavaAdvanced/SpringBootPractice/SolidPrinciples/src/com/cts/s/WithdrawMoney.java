package com.cts.s;

public class WithdrawMoney {

	private Account account;
	private double money;
	
	
	public WithdrawMoney(Account account, double money) {
		this.account = account;
		this.money = money;
	}


	public void withdrawMoney() {
		if(money>account.getBalance()) {
		System.out.println("Insufficient Balance");
		}else {
			account.setBalance(account.getBalance()-money);
		}
	}
}
