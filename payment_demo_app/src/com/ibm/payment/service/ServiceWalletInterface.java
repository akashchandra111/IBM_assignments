package com.ibm.payment.service;

import com.ibm.payment.bean.UserAccount;

public interface ServiceWalletInterface {
	public abstract void createAccount(UserAccount account);
	public abstract void lowBalance(UserAccount account);
	public abstract void deposit(UserAccount account, String amount);
	public abstract void withdraw(UserAccount account, String amount);
	public abstract void fundTransfer(UserAccount account, String toAccount, String amount);
	public abstract String printTransaction(String fromDate, String toDate, UserAccount account, String type);
}
