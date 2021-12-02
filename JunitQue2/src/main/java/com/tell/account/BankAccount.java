package com.tell.account;

import javax.naming.InsufficientResourcesException;

public class BankAccount {
	int a;
	int withdraw;
	int BankAccountBalance = 20000;
public String Withdraw(int a) throws InsufficientResourcesException  {
	if(a< BankAccountBalance) {
		return ("wait for a momment");
	}
	else
	{
		throw new InsufficientResourcesException("Insufficient Funds");
	}
	
}
}

