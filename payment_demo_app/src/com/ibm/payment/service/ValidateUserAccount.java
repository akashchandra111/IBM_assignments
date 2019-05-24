package com.ibm.payment.service;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserAccount {
	
	public static boolean validateUser(String name)	{
		Pattern userPattern = Pattern.compile("([a-zA-Z]+[ ']{0,1}[a-zA-Z]+){2,20}");
		Matcher matchUserPattern = userPattern.matcher(name);
		
		return matchUserPattern.matches();
	}
	
	public static boolean validatePhone(String phoneNumber)	{
		Pattern phonePattern = Pattern.compile("[0-9]{10}");
		Matcher matchPhonePattern = phonePattern.matcher(phoneNumber);
		
		return matchPhonePattern.matches();
	}
	
	public static boolean validateMoney(String money)	{
		Pattern moneyPattern = Pattern.compile("[0-9]{0, 12}");
		Matcher matchMoneyPattern = moneyPattern.matcher(money);
		
		return matchMoneyPattern.matches();
	}
	
	public static boolean validateAddress(String address)	{
		Pattern addrPattern = Pattern.compile("([a-zA-Z0-9]*[ ,]{0,1}){3,30}");
		Matcher matchAddrPattern = addrPattern.matcher(address);
		
		return matchAddrPattern.matches();
	}
	
	public static boolean validateAcctNo(String acctNum)	{
		Pattern acctNumPattern = Pattern.compile("[0-9]{9}");
		Matcher matchAcctNumPattern = acctNumPattern.matcher(acctNum);
		
		return matchAcctNumPattern.matches();
	}
	
	public static String getAndValidate(String type)	{
		Scanner scan = new Scanner(System.in);
		boolean problemFound = false;
		
		do	{
			String str = scan.nextLine();
			try	{
				if(type.equals("name"))	{
					if(ValidateUserAccount.validateUser(str))	return str;
					else	{
						System.out.println("invalid characters found, try again!");
						problemFound = true;
					}
				}
				else if(type.equals("phone"))	{
					if(ValidateUserAccount.validatePhone(str))	return str;
					else	{
						System.out.println("[correct 10 numbers required] invalid length/characters found, try again!");
						problemFound = true;
					}
				}
				else if(type.equals("money"))	{
					if(ValidateUserAccount.validateMoney(str))	return str;
					else	{
						System.out.println("[1-12 digit is accepted] invalid length/characters found, try again!");
						problemFound = true;
					}
				}
				else if(type.equals("address"))	{
					if(ValidateUserAccount.validateAddress(str))	return str;
					else	{
						System.out.println("invalid address please don't use special characters except ',', try again!");
						problemFound = true;
					}
				}
				else if(type.equals("acct_no"))	{
					if(ValidateUserAccount.validateAcctNo(str))	return str;
					else	{
						System.out.println("invalid account number, should be numberic 9 digit unique number, try again!");
						problemFound = true;
					}
				}
				else	{
					System.out.println("invalid selection for validation correct in your code");
					throw new Exception("change your code to valid validation method");
				}
			}
			catch(Exception e)	{
				System.out.println(e);
				problemFound = true;
			}
		}
		while(problemFound == true);
		
		scan.close();
		
		return null;
	}
}
