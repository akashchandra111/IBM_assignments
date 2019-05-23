package com.ibm.payment.service;

import com.ibm.payment.bean.UserAccount;

public class ServiceWallet implements ServiceWalletInterface {

	@Override
	public boolean createAccount() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void lowBalance(UserAccount account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deposit(UserAccount account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean withdraw(UserAccount account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean fundTransfer(UserAccount account, Long toAccount, Long amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String printTransaction(UserAccount account) {
		// TODO Auto-generated method stub
		return null;
	}

}
