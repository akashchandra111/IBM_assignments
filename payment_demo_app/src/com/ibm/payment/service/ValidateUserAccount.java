package com.ibm.payment.service;

public class ValidateUserAccount {
	public static boolean validateUser(String name)	{
		return !name.contains("0123456789");
	}
	
	public static boolean validatePhone(String phoneNumber)	{
		return phoneNumber.length() == 10;
	}
}
