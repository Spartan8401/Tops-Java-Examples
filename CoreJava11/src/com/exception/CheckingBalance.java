package com.exception;

public class CheckingBalance {
	int acno;
	double balance;
	public CheckingBalance(int acno, double balance) {
		this.acno = acno;
		this.balance = balance; 
		System.out.println("Hello "+this.acno+" your Account Is Now Oppen with "+this.balance+" Rs.");
	}
	
	public void deposite(double amount) {
		this.balance=this.balance+amount;
	}
	
	public void withdraw(double amount) throws Insuficientfunds{
		if(amount<=this.balance) {
			this.balance=this.balance-amount;
		}else {
			double needs = amount-this.balance;
			throw new Insuficientfunds(needs);
		}
		
	}
	public void curentbalance(double amount) {
	System.out.println("CurrentBalance:"+this.balance);
	}

}
