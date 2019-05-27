package com.ibm.unittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.ibm.payment.bean.UserAccount;
import com.ibm.payment.service.ServiceWallet;

@TestInstance(Lifecycle.PER_CLASS)
class WalletUnitTestCases {

	private static UserAccount account;
	//final private static ServiceWallet wallet;
	
	static	{
		account = new UserAccount();
		//wallet = new ServiceWallet();
	}
	
	//UserAccount Tests
	@Test
	void userAccountTest()	{
		
		account.setAcctHolderName("Akash");
		account.setAcctNo("200321343");
		account.setAcctHolderContact("8979583828");
		account.setAcctHolderAddr("bangalore");
		
		assertAll(
			() -> assertEquals("Akash", account.getAcctHolderName(), "fails!"),
			() -> assertEquals("200321343", account.getAcctNo(), "fails!"),
			() -> assertEquals("8979583828", account.getAcctHolderContact(), "fails!"),
			() -> assertEquals("bangalore", account.getAcctHolderAddr(), "fails!")
		);
	}

}

