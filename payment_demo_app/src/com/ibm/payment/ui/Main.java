package com.ibm.payment.ui;

import java.util.Scanner;

import com.ibm.payment.WalletException.WalletProblem;
import com.ibm.payment.bean.UserAccount;
import com.ibm.payment.service.ServiceWallet;

public class Main {
	
	private static UserAccount account = null;
	private static boolean userExists = false;
	private static ServiceWallet userWallet = null;
	private static Scanner scan = null;
	
	static	{
		scan = new Scanner(System.in);
		userWallet = new ServiceWallet();
		account = new UserAccount(null, null, null, null);
	}

	public static void main(String[] args) {
		System.out.println("================== User Wallet ==================");
		boolean errorOccured = false;
		
		do	{
			System.out.println("[1: Open Account]\n[2: Deposit Money]\n[3: WithDraw Money]\n[4: Fund Transfer]\n[5: Mini Statement]\n[6: Change User]\n[7: Exit]");
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
						errorOccured = false;
						break;
					default:
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
	}
	
	public static void addUser()	{
		System.out.print("Enter name: ");
		String name = scan.nextLine();
		System.out.print("Enter mobile number: ");
		String mNumber = scan.nextLine();
		System.out.print("Enter address: ");
		String addr = scan.nextLine();
		String acctNo;
		try {
			acctNo = userWallet.generateUserAcctNum();
			Main.account = new UserAccount(acctNo, name, mNumber, addr);
			Main.userExists = true;
			Main.userWallet.createAccount(Main.account);
		}
		catch (WalletProblem e) {
			System.out.println(e);
		}
		
		
	}
	
	public static void depositUserMoney()	{
		if(Main.userExists)	{
			System.out.print("How much to deposit: ");
			try {
				Main.userWallet.deposit(Main.account, scan.nextLine());
			}
			catch (WalletProblem e) {
				System.out.println(e);
			}
		}
		else
			System.out.println("Change to valid account first!");
	}
	
	public static void withdrawUserMoney()	{
		if(Main.userExists)	{
			System.out.print("How much to withdraw: ");
			try {
				Main.userWallet.withdraw(Main.account, scan.nextLine());
			}
			catch (WalletProblem e) {
				System.out.println(e);
			}
		}
		else
			System.out.println("Change to valid account first!");
	}
	
	public static void fundTransferUserMoney()	{
		if (Main.userExists)	{
			System.out.print("Enter benificiary account number: ");
			String benificiaryAcctNo = scan.nextLine();
			System.out.println("Enter amount: ");
			String amount = scan.nextLine();
		
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
		System.out.println("Select Type: \n[1: Deposit]\n[2: Withdrawl]\n[3: Fund Transfer]");
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
	
	public static void changeUser()	{
		System.out.println("Enter id: ");
		Main.account = new UserAccount(Main.scan.nextLine(), null, null, null);
		
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

}
