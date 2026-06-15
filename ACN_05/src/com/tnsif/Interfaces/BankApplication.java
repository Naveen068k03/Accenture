package com.tnsif.Interfaces;

public class BankApplication {

	public static void main(String[] args) {
		Bank bank = new BankImple();
		
		Account account = new Account(12345, "Naveen", 30000, bank);

		bank.deposite(account, 2000);
		System.out.println(account);
		
		bank.withdrawl(account, 10000);
		System.out.println(account);

	}

}
