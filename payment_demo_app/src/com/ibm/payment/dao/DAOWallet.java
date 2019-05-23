package com.ibm.payment.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

import com.ibm.payment.bean.UserAccount;

public class DAOWallet implements DAOWalletInterface {
	
	private static Connection dbConnection = null;
	private static PreparedStatement stmt = null;
	
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	
	public void createConnection(String dbName, String userName, String password)	{
		
		try	{
			String timeZoneCorrection = "?serverTimezone=" + TimeZone.getDefault().getID();
			
			Class.forName("com.mysql.jdbc.Driver");
			
			DAOWallet.dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dbName + timeZoneCorrection, userName, password);
			
		}
		catch(ClassNotFoundException | SQLException e)	{
			System.out.println("[createConnection]\n" + e.getMessage());
		}
		
	}

	@Override
	public void createAccountToDb(UserAccount account)	{
		String acctNo = account.getAcctNo();
		String acctHolderName = account.getAcctHolderName();
		String acctContactNo = account.getAcctHolderContact();
		String acctHolderAddr = account.getAcctHolderAddr();
		
		String queryUserTable = "insert into user_table values(?, ?, ?, ?)";
		String queryAmountTable = "insert into amount_table values(?, ?)";
		String queryUserLogTable = "insert into users_logs values(?, ?, ?)";
		
		try	{
			
			//user table insertion
			DAOWallet.stmt = DAOWallet.dbConnection.prepareStatement(queryUserTable);
			DAOWallet.stmt.setString(1, acctNo);
			DAOWallet.stmt.setString(2, acctHolderName);
			DAOWallet.stmt.setString(3, acctContactNo);
			DAOWallet.stmt.setString(4, acctHolderAddr);
			int msgUserTable = DAOWallet.stmt.executeUpdate();
			//System.out.println("Done!");
			
			//amount table insertion
			DAOWallet.stmt = DAOWallet.dbConnection.prepareStatement(queryAmountTable);
			DAOWallet.stmt.setString(1, acctNo.toString());
			DAOWallet.stmt.setString(2, "0");
			int msgAmountTable = DAOWallet.stmt.executeUpdate();
			//System.out.println("Done!");
			
			//log table insertion
			DAOWallet.stmt = DAOWallet.dbConnection.prepareStatement(queryUserLogTable);
			DAOWallet.stmt.setString(1, acctNo.toString());
			DAOWallet.stmt.setString(2, acctNo.toString());
			String passIt = "C " + LocalDate.now().format(dtf) + " Account_Created!";
			DAOWallet.stmt.setString(3, passIt);
			int msgUserLogTable = DAOWallet.stmt.executeUpdate();
			//System.out.println("Done!");
			
			if(msgUserTable!=0 && msgAmountTable!=0 && msgUserLogTable!=0)
				System.out.println("User Account created successfully!\n" + "Your account number is: " + acctNo);
			else
				System.out.println("Problem occured, please report to bank!");
		}
		catch(SQLException e)	{
			System.out.println("[createAccountToDb]\n" + e.getMessage());
		}
	}

	@Override
	public long fetchAmount(String accountNo) {
		String queryAmountTable = "select acct_amount from amount_table where acct_no='" + accountNo + "'";
		
		//fetching amount from amount table
		ResultSet rs=null;
		try {
			DAOWallet.stmt = DAOWallet.dbConnection.prepareStatement(queryAmountTable);
			
			rs = stmt.executeQuery();
			
			long returnIt = rs.getLong(1);
			
			rs.close();
			
			return returnIt;
		}
		catch (SQLException e) {
			System.out.println("[fetchAmount]\n" + e.getMessage());
		}
		return 0L;
	}

	@Override
	public void deposit(String toAccountNo, String fromAccountNo, String amount) {
		String queryAmountTable = "update amount_table set acct_amount=acct_amount+? where acct_no=?";
		String queryUserLogTable = "insert into users_logs values(?, ?, ?)";
		
		try	{
			
			DAOWallet.stmt = DAOWallet.dbConnection.prepareStatement(queryAmountTable);
			DAOWallet.stmt.setString(1, amount);
			DAOWallet.stmt.setString(2, toAccountNo);
			int msgAmountTable = DAOWallet.stmt.executeUpdate();
			
			DAOWallet.stmt = DAOWallet.dbConnection.prepareStatement(queryUserLogTable);
			DAOWallet.stmt.setString(1, toAccountNo);
			DAOWallet.stmt.setString(2, fromAccountNo);
			DAOWallet.stmt.setString(3, "D " + LocalDate.now().format(dtf) + " " + amount + "_Deposited!");
			int msgUserLogTable = DAOWallet.stmt.executeUpdate();
			
			if(msgAmountTable!=0 && msgUserLogTable!=0)
				System.out.println("Money Deposited @" + toAccountNo + " amount: " + amount);
			else	
				System.out.println("Please contact bank");
		}
		catch(SQLException e)	{
			System.out.println("[deposit]\n" + e.getMessage());
		}
	}

	@Override
	public void withdraw(String fromAccountNo, String toAccountNo, String amount) {
		String queryAmountTable = "update amount_table set acct_amount=acct_amount-? where acct_no=?";
		String queryUserLogTable = "insert into users_logs values(?, ?, ?)";
		
		try	{
			DAOWallet.stmt = DAOWallet.dbConnection.prepareStatement(queryAmountTable);
			DAOWallet.stmt.setString(1, amount);
			DAOWallet.stmt.setString(2, fromAccountNo);
			int msgAmountTable = DAOWallet.stmt.executeUpdate();
			
			DAOWallet.stmt = DAOWallet.dbConnection.prepareStatement(queryUserLogTable);
			DAOWallet.stmt.setString(1, fromAccountNo);
			DAOWallet.stmt.setString(2, toAccountNo);
			DAOWallet.stmt.setString(3, "W " + LocalDate.now().format(dtf) + " " + amount + "_withdrawn!");
			int msgUserLogTable = DAOWallet.stmt.executeUpdate();
			
			if(msgAmountTable!=0 && msgUserLogTable!=0)
				System.out.println("Money withdrawn @" + fromAccountNo + " amount: " + amount);
			else	
				System.out.println("Please contact bank");
		}
		catch(SQLException e)	{
			System.out.println("[deposit]\n" + e.getMessage());
		}
	}

	@Override
	public void fundTransfer(String fromAccountNo, String toAccountNo, String amount) {
		new DAOWallet().withdraw(fromAccountNo, toAccountNo, amount);
		new DAOWallet().deposit(toAccountNo, fromAccountNo, amount);
		
		String queryUserLogTable = "insert into users_logs values(?, ?, ?)";
		
		try	{
			DAOWallet.stmt = DAOWallet.dbConnection.prepareStatement(queryUserLogTable);
			DAOWallet.stmt.setString(1, fromAccountNo);
			DAOWallet.stmt.setString(2, toAccountNo);
			DAOWallet.stmt.setString(3, "F " + LocalDate.now().format(dtf) + " " + amount + "_transferred!");
			int msgUserLogTable = DAOWallet.stmt.executeUpdate();
			
			if(msgUserLogTable!=0)
				System.out.println("Money is funded to account no: " + toAccountNo + " from account no: " + fromAccountNo + " transferred: " + amount);
			else
				System.out.println("Please contact bank!");
		}
		catch(SQLException e)	{
			System.out.println("[fundTransfer]\n" + e.getMessage());
		}
	}

	@Override
	public String getLog(String fromDate, String toDate, String userAcctNo, String type) {
		String queryUserLogTable = "select * from users_logs where acct_no=?";
		
		try	{
			DAOWallet.stmt = DAOWallet.dbConnection.prepareStatement(queryUserLogTable);
			DAOWallet.stmt.setString(1, userAcctNo);
			ResultSet rs = DAOWallet.stmt.executeQuery();
			
			String passThis = "";
			while(rs.next())	{
				String acctNo = rs.getString(1);
				String toAcctNo = rs.getString(2);
				String[] vals = rs.getString(3).split(" ");
				
				//System.out.println(acctNo + " " + toAcctNo + " " + vals[0] + " " + vals[1] + " " + vals[2]);
				
				if(type.equals("C") && vals[0].equals("C"))	{
					passThis += acctNo + " -> " + toAcctNo + " "  + vals[1] + " " + vals[2] + "\n"; 
				}
				else if(type.equals("D") && vals[0].equals("D"))	{
					passThis += acctNo + " -> " + toAcctNo + " "  + vals[1] + " " + vals[2] + "\n"; 
				}
				else if(type.equals("W") && vals[0].equals("W"))	{
					passThis += acctNo + " -> " + toAcctNo + " "  + vals[1] + " " + vals[2] + "\n"; 
				}
				else if(type.equals("F") && vals[0].equals("F"))	{
					passThis += acctNo + " -> " + toAcctNo + " "  + vals[1] + " " + vals[2] + "\n"; 
				}
			}
			
			rs.close();
			return passThis;
		}
		catch(SQLException e)	{
			System.out.println("[getLog]\n" + e.getMessage());
		}
		return null;
	}
	
	public String getBalance(String acctNo)	{
		String queryAmountTable = "select acct_amount from amount_table where acct_no=?";
		
		try	{
			DAOWallet.stmt = DAOWallet.dbConnection.prepareStatement(queryAmountTable);
			DAOWallet.stmt.setString(1, acctNo);
			
			ResultSet rs = DAOWallet.stmt.executeQuery();
			
			rs.next();
			String returnIt = rs.getString(1);
			
			rs.close();
			return returnIt;
		}
		catch(SQLException e)	{
			System.out.println("[getBalance]\n" + e.getMessage());
		}
		return null;
	}
	
//	public String get(String tableName, String acctNo, String whatToGet)	{
//		String queryToFetch = "select ? from ? where acct_no=?";
//		
//		try	{
//			DAOWallet.stmt = DAOWallet.dbConnection.prepareStatement(queryToFetch);
//			DAOWallet.stmt.setString(1, whatToGet);
//			DAOWallet.stmt.setString(2, tableName);
//			DAOWallet.stmt.setString(3, acctNo);
//			ResultSet rs = DAOWallet.stmt.executeQuery();
//			
//			rs.next();
//			String returnIt = rs.getString(1);
//			rs.close();
//			
//			return returnIt;
//		}
//		catch(SQLException e)	{
//			System.out.println("[get]\n" + e.getMessage());
//		}
//		return null;
//	}
}
