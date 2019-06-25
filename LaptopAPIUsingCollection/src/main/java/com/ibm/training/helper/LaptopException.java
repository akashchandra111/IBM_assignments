package com.ibm.training.helper;

public class LaptopException extends Exception	{

	//Constructor calling Exception class to print the message
	public LaptopException(String s)	{
		super(s);
	}

	@Override
	public String toString()	{
		return "LaptopException: " + super.toString();
	}
}
