package com.ibm.payment.service;

import com.ibm.payment.bean.UserAccount;
import com.ibm.payment.dao.DAOWallet;
import com.ibm.payment.walletexception.WalletProblem;

public class ServiceWallet implements ServiceWalletInterface {
	
	private static DAOWallet walletDbConnection = null;
	
	static	{
		walletDbConnection = new DAOWallet();
		try {
			walletDbConnection.createConnection("bank_wallet", "root", "");
		} catch (WalletProblem e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String generateUserAcctNum() throws WalletProblem	{
		
		long timeSeed = System.nanoTime();
		double randomSeed = Math.random() * 1000;
		long midSeed = (long) (timeSeed*randomSeed);
		
		String num = midSeed + "";
		
		return num.substring(0, 9);
	}

	@Override
	public void createAccount(UserAccount account) throws WalletProblem {
		walletDbConnection.createAccountToDb(account);
		System.out.println("Current Balance: " + this.getBalance(account));
	}

	@Override
	public void lowBalance(UserAccount account) throws WalletProblem {
		System.out.println("Your account balance is lower than recommended limit!, transaction can't be completed!\nBalance: " + this.getBalance(account));
	}

	@Override
	public void deposit(UserAccount account, String amount) throws WalletProblem {
		walletDbConnection.deposit(account.getAcctNo(), account.getAcctNo(), amount);
		System.out.println("Current Balance: " + this.getBalance(account));
	}

	@Override
	public void withdraw(UserAccount account, String amount) throws WalletProblem {
		if(Long.parseLong(walletDbConnection.getBalance(account.getAcctNo()))<Long.parseLong(amount))
			this.lowBalance(account);
		else	{
			walletDbConnection.withdraw(account.getAcctNo(), account.getAcctNo(), amount);
			System.out.println("Current Balance: " + this.getBalance(account));
		}
	}

	@Override
	public void fundTransfer(UserAccount account, String toAccount, String amount) throws WalletProblem {
		if(Long.parseLong(this.getBalance(account))<Long.parseLong(amount))
			this.lowBalance(account);
		else	{
			walletDbConnection.fundTransfer(account.getAcctNo(), toAccount, amount);
			System.out.println("Current Balance: " + this.getBalance(account));
		}
	}

	@Override
	public String printTransaction(String fromDate, String toDate, UserAccount account, String type) throws WalletProblem {
		System.out.println("Current Balance: " + this.getBalance(account));
		return walletDbConnection.getLog(fromDate, toDate, account.getAcctNo(), type);
	}
	
	public boolean checkUser(UserAccount account) throws WalletProblem	{
		return walletDbConnection.isAccountPresent(account.getAcctNo());
	}
	
	public String getBalance(UserAccount account) throws WalletProblem	{
		return walletDbConnection.getBalance(account.getAcctNo());
	}

}
