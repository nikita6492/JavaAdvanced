package com.cts.d;

class Bank {
    private Account account;
    
    public Bank(Account account) {
        this.account = account;
    }
    
    public void deposit(double amount) {
        account.deposit(amount);
    }
    
    public void withdraw(double amount) {
        account.withdraw(amount);
    }
    
    public void getBalance() {
        account.getBalance();
    }
}



