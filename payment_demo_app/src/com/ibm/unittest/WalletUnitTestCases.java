package com.ibm.unittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.ibm.payment.bean.UserAccount;
import com.ibm.payment.service.ServiceWallet;
import com.ibm.payment.service.ValidateUserAccount;

@TestInstance(Lifecycle.PER_CLASS)
class WalletUnitTestCases {

	private static UserAccount account, anotherAccount;
	final private static ServiceWallet wallet;
	
	static	{
		account = new UserAccount();
		anotherAccount = new UserAccount();
		wallet = new ServiceWallet();
		
		//User data generation
		account.setAcctHolderName("Akash Chandra");
		account.setAcctNo("12395481");
		account.setAcctHolderContact("8979583828");
		account.setAcctHolderAddr("bangalore");
		
		anotherAccount.setAcctHolderName("Akash Chandra");
		anotherAccount.setAcctNo("12394345");
		anotherAccount.setAcctHolderContact("8979583828");
		anotherAccount.setAcctHolderAddr("bangalore");	
	}
	
	//UserAccount Tests
	@Test
	void userAccountTests()	{
		assertAll(
			() -> assertEquals("Akash Chandra", account.getAcctHolderName(), "fails!"),
			() -> assertEquals("12395481", account.getAcctNo(), "fails!"),
			() -> assertEquals("8979583828", account.getAcctHolderContact(), "fails!"),
			() -> assertEquals("bangalore", account.getAcctHolderAddr(), "fails!")
		);
	}
	
	//Validations Tests
	@Test
	void userValidationTests()	{
		assertAll(
			() -> assertEquals(true, ValidateUserAccount.validateUser("Akash Chandra"), "name validation failed!"),
			() -> assertEquals(false, ValidateUserAccount.validateUser("Akash-Chandra"), "name validation failed!"),
			
			() -> assertEquals(true, ValidateUserAccount.validatePhone("8979583828"), "phone validation failed!"),
			() -> assertEquals(false, ValidateUserAccount.validatePhone("8979583828A"), "phone validation failed!"),
			
			() -> assertEquals(true, ValidateUserAccount.validateMoney("12000"), "money validation failed!"),
			() -> assertEquals(false, ValidateUserAccount.validateMoney("1200000000000"), "money validation failed!"),
			
			() -> assertEquals(true, ValidateUserAccount.validateAddress("35C bangalore"), "address validation failed!"),
			() -> assertEquals(false, ValidateUserAccount.validateAddress("35C; bangalore"), "address validation failed!"),
			
			()-> assertEquals(true, ValidateUserAccount.validateAcctNo("321439847"), "account no. validation failed!"),
			()-> assertEquals(false, ValidateUserAccount.validateAcctNo("39213fja"), "account no. validation failed!")
		);
	}
	
	//Wallet Service Tests
	@Test
	void serviceWalletTests()	{
		assertAll(
			() -> assertEquals(true, wallet.checkUser(account),"checkUser failed!"),
			() -> assertEquals(false, wallet.checkUser(anotherAccount), "checkUser failed!"),
			
			() -> assertEquals("16090", wallet.getBalance(account), "getBalance failed")
			//,() -> assertThrows(WalletProblem.class, () -> wallet.getBalance(anotherAccount), "getBalance failed")
		);
	}
}

