package com.nt.encapsulation.test;

public class BankAccount {
	private double balance;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if(balance<=0)
			System.out.println("Do not enter negative amount");
		else
			this.balance = balance;
	}
	
}
