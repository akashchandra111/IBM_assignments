package com.ibm.payment.dao;

import com.ibm.payment.bean.UserAccount;
import com.ibm.payment.walletexception.WalletProblem;

public interface DAOWalletInterface {
	public abstract void createAccountToDb(UserAccount account) throws WalletProblem;
	public abstract long fetchAmount(String accountNo) throws WalletProblem;
	public abstract void deposit(String toAccountNo, String fromAccountNo, String amount) throws WalletProblem;
	public abstract void withdraw(String fromAccountNo, String toAccountNo, String amount) throws WalletProblem;
	public abstract void fundTransfer(String fromAccountNo, String toAccountNo, String amount) throws WalletProblem;
	public abstract String getLog(String fromDate, String toDate, String userAcctNo, String type) throws WalletProblem;
	
}
