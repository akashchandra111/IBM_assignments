package com.ibm.payment.ui;

import java.util.Scanner;

import com.ibm.payment.bean.UserAccount;
import com.ibm.payment.service.ServiceWallet;
import com.ibm.payment.service.ValidateUserAccount;
import com.ibm.payment.walletexception.WalletProblem;

public class Main {
	
	private static UserAccount account = null;
	private static boolean userExists = false;
	private static ServiceWallet userWallet = null;
	private static Scanner scan = null;
	
	static	{
		scan = new Scanner(System.in);
		userWallet = new ServiceWallet();
		account = null;
	}

	public static void main(String[] args) {
		System.out.println("================== User Wallet ==================");
		boolean errorOccured = false;
		
		do	{
			System.out.println("[1: Open Account]\n[2: Deposit Money]\n[3: WithDraw Money]\n[4: Fund Transfer]\n[5: Mini Statement]\n[6: Change User]\n[7: Balance]\n[8: Exit]");
			try	{
				errorOccured = true;
				switch(Integer.parseInt(scan.nextLine()))	{
					case 1:
						Main.addUser();
						break;
					case 2:
						Main.depositUserMoney();
						break;
					case 3:
						Main.withdrawUserMoney();
						break;
					case 4:
						Main.fundTransferUserMoney();
						break;
					case 5:
						Main.userMiniStatement();
						break;
					case 6:
						Main.changeUser();
						break;
					case 7:
						Main.checkBalance();
						break;
					case 8:
						errorOccured = false;
						break;
					default:
						//System.out.println("Got: " + );
						System.out.println("Wrong option, try again!");
				}
			}
			catch(Exception e) {
				System.out.println("[main]\n" + e.getMessage() + "\n" + e);
				errorOccured = true;
			}
		}
		while(errorOccured == true);
		Main.scan.close();
		System.out.println("================== Wallet Exited ====================");
	}
	
	public static void addUser() throws NumberFormatException	{
		System.out.print("Enter name: ");
		String name = ValidateUserAccount.getAndValidate("name");
		System.out.print("Enter mobile number: ");
		String mNumber = ValidateUserAccount.getAndValidate("phone");
		System.out.print("Enter address: ");
		String addr = ValidateUserAccount.getAndValidate("address");
		String acctNo;
		try {
			acctNo = userWallet.generateUserAcctNum();
			//System.out.println(acctNo);
			Main.account = new UserAccount(acctNo, name, mNumber, addr);
			Main.userExists = true;
			Main.userWallet.createAccount(Main.account);
		}
		catch (WalletProblem e) {
			System.out.println("Account number might already be present try again!");
			System.out.println(e);
		}
		
		
	}
	
	public static void depositUserMoney() throws NumberFormatException	{
		if(Main.userExists)	{
			System.out.print("How much to deposit: ");
			try {
				Main.userWallet.deposit(Main.account, ValidateUserAccount.getAndValidate("money"));
			}
			catch (WalletProblem e) {
				System.out.println(e);
			}
		}
		else
			System.out.println("Change to valid account first!");
	}
	
	public static void withdrawUserMoney() throws NumberFormatException	{
		if(Main.userExists)	{
			System.out.print("How much to withdraw: ");
			try {
				Main.userWallet.withdraw(Main.account, ValidateUserAccount.getAndValidate("money"));
			}
			catch (WalletProblem e) {
				System.out.println(e);
			}
		}
		else
			System.out.println("Change to valid account first!");
	}
	
	public static void fundTransferUserMoney() throws NumberFormatException	{
		if (Main.userExists)	{
			System.out.print("Enter benificiary account number: ");
			String benificiaryAcctNo = ValidateUserAccount.getAndValidate("acct_no");
			System.out.println("Enter amount: ");
			String amount = ValidateUserAccount.getAndValidate("money");
		
			try {
				Main.userWallet.fundTransfer(Main.account, benificiaryAcctNo, amount);
			}
			catch (WalletProblem e) {
				System.out.println(e);
			}
		}
		else
			System.out.println("Change to valid account first!");
	}
	
	public static void userMiniStatement()	{
		System.out.println("Select Type: \n[1: Deposit]\n[2: Withdrawl]\n[3: Fund Transfer]\n[4: All]");
		if(Main.userExists)	{
			try	{
				switch(Integer.parseInt(scan.nextLine()))	{
					case 1:
						System.out.println(Main.userWallet.printTransaction("", "", Main.account, "D"));
						break;
					case 2:
						System.out.println(Main.userWallet.printTransaction("", "", Main.account, "W"));
						break;
					case 3:
						System.out.println(Main.userWallet.printTransaction("", "", Main.account, "F"));
						break;
					case 4:
						System.out.println(Main.userWallet.printTransaction("", "", Main.account, "A"));	//Works without giving A
						break;
					default:
						System.out.println("Wrong option selected");
				}
			}
			catch(WalletProblem e)	{
				System.out.println(e);
			}
		}
		else
			System.out.println("Change to valid account first!");
	}
	
	public static void changeUser() throws NumberFormatException	{
		System.out.println("Enter id: ");
		Main.account = new UserAccount(ValidateUserAccount.getAndValidate("acct_no"), null, null, null);
		
		try {
			if(Main.userWallet.checkUser(Main.account))	{
				System.out.println("User account exists, selecting as current user!");
				Main.userExists = true;
			}
			else	{
				System.out.println("User account doesn't exist, try creating it before using it!");
				Main.userExists = false;
			}
		} catch (WalletProblem e) {
			System.out.println(e);
		}
	}
	
	public static void checkBalance()	{
		if (Main.userExists)	{
			try {
			System.out.println("Balance is: " + Main.userWallet.getBalance(Main.account));
			}
			catch (WalletProblem e) {
				System.out.println(e);
			}
		}
		else
			System.out.println("Change to valid account first!");
	}

}
