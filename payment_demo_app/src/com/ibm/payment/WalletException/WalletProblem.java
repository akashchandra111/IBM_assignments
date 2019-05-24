package com.ibm.payment.WalletException;

public class WalletProblem extends Exception{

	private static final long serialVersionUID = 1L;
	
	private String msg = null;
	
	public WalletProblem(String msg)	{
		super(msg);
		this.msg = msg;
	}
	
	public String getMessage()	{
		return this.msg;
	}
}
