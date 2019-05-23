package com.ibm.payment.dao;

import com.ibm.payment.bean.UserAccount;

public interface DAOWalletInterface {
	public abstract void createAccountToDb(UserAccount account);
	public abstract long fetchAmount(String accountNo);
	public abstract void deposit(String toAccountNo, String fromAccountNo, String amount);
	public abstract void withdraw(String fromAccountNo, String toAccountNo, String amount);
	public abstract void fundTransfer(String fromAccountNo, String toAccountNo, String amount);
	public abstract String getLog(String fromDate, String toDate, String userAcctNo, String type);
	
}
