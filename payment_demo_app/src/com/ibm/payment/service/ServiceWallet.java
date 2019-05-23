package com.ibm.payment.service;

import com.ibm.payment.bean.UserAccount;
import com.ibm.payment.dao.DAOWallet;

public class ServiceWallet implements ServiceWalletInterface {
	
	private static DAOWallet walletDbConnection = new DAOWallet();

	@Override
	public void createAccount(UserAccount account) {
		walletDbConnection.createAccountToDb(account);
	}

	@Override
	public void lowBalance(UserAccount account) {
		System.out.println("Your account balance is lower than recommended limit!, transaction can't be completed!\nBalance: " + walletDbConnection.getBalance(account.getAcctNo()));
	}

	@Override
	public void deposit(UserAccount account, String amount) {
		walletDbConnection.deposit(account.getAcctNo(), account.getAcctNo(), amount);
	}

	@Override
	public void withdraw(UserAccount account, String amount) {
		if(Long.parseLong(walletDbConnection.getBalance(account.getAcctNo()))<Long.parseLong(amount))
			this.lowBalance(account);
		else
			walletDbConnection.withdraw(account.getAcctNo(), account.getAcctNo(), amount);
	}

	@Override
	public void fundTransfer(UserAccount account, String toAccount, String amount) {
		if(Long.parseLong(walletDbConnection.getBalance(account.getAcctNo()))<Long.parseLong(amount))
			this.lowBalance(account);
		else
			walletDbConnection.fundTransfer(account.getAcctNo(), toAccount, amount);
	}

	@Override
	public String printTransaction(String fromDate, String toDate, UserAccount account, String type) {
		return walletDbConnection.getLog(fromDate, toDate, account.getAcctNo(), type);
	}

}
