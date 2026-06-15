package com.tnsif.Interfaces;

public class BankImple implements Bank{

	@Override
	public void deposite(Account account, double amount) {
		if(amount>Deposite_limit)
		{
			System.out.println("Deposite is not possible for this account"+ account.getBal());
		}
		else {
			account.setBal(account.getBal()+amount);
			System.out.println("Deposited the amount to the account to the account now the balance is: "+ account.getBal());
		}
		
		
	}

	@Override
	public void withdrawl(Account account, double amount) {
		if((account.getBal()-amount)>Min_Bal)
		{
			account.setBal(account.getBal()-amount);
			System.out.println("Transaction is Successfully Completed now the bal is : " +account.getBal());
		}else {
			System.out.println("The Transaction is failed");
		}
		
		
	}

	
	

}
