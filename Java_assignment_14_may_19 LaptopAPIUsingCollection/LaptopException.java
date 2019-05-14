package com.dev.exception;

public class LaptopException extends Exception	{

	public LaptopException(String s)	{
		super(s);
	}

	@Override
	public String toString()	{
		return "LaptopException: " + super.toString();
	}
}
