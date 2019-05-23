package com.ibm.payment.service;

import com.ibm.payment.bean.UserAccount;

public interface ServiceWalletInterface {
	public abstract boolean createAccount();
	public abstract void lowBalance(UserAccount account);
	public abstract boolean deposit(UserAccount account);
	public abstract boolean withdraw(UserAccount account);
	public abstract boolean fundTransfer(UserAccount account, Long toAccount, Long amount);
	public abstract String printTransaction(UserAccount account);
}
