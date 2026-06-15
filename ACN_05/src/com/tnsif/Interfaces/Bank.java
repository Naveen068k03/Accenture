package com.tnsif.Interfaces;

public interface Bank {
	
	int Min_Bal=1000;
	int Deposite_limit = 25000;
	
	void deposite(Account account, double amount);
	void withdrawl(Account account, double amount);
	
}
