package com.ibm.payment.service;

import com.ibm.payment.bean.UserAccount;
import com.ibm.payment.walletexception.WalletProblem;

public interface ServiceWalletInterface {
	public abstract void createAccount(UserAccount account) throws WalletProblem;
	public abstract void lowBalance(UserAccount account) throws WalletProblem;
	public abstract void deposit(UserAccount account, String amount) throws WalletProblem;
	public abstract void withdraw(UserAccount account, String amount) throws WalletProblem;
	public abstract void fundTransfer(UserAccount account, String toAccount, String amount) throws WalletProblem;
	public abstract String printTransaction(String fromDate, String toDate, UserAccount account, String type) throws WalletProblem;
}
