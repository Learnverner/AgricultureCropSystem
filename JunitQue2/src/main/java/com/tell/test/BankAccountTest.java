package com.tell.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.naming.InsufficientResourcesException;

import org.junit.jupiter.api.Test;

import com.tell.account.BankAccount;

class BankAccountTest {

	@Test
	void testwithdraw() {
		BankAccount a = new BankAccount();
		assertThrows(InsufficientResourcesException.class, ()-> a.Withdraw(20000),"An Exception may be occurred" );
	}
	
	
	@Test
	void testwithdraw1() throws InsufficientResourcesException {
		BankAccount a1 = new BankAccount();
		String expected = "wait for a momment";
		assertEquals(expected, a1.Withdraw(19999));
	}
}

