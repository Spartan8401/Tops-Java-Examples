package com.exception;

public class Insuficientfunds extends Exception{
	double amount;
	public Insuficientfunds(double amount) {
		this.amount=amount;
	}
	public double getAmount(double amount) {
		return this.amount;
	}

}
