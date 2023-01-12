package com.cts.d;

public class AccountInfo {
	
	protected int accountId;
	
	protected String accountName;
	
	protected double balance;

	public AccountInfo(int accountId, String accountName, double balance) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "AccountInfo [accountId=" + accountId + ", accountName=" + accountName + ", balance=" + balance + "]";
	}
	
	

}
