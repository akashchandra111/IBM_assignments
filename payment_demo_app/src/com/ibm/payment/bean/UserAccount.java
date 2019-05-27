package com.ibm.payment.bean;

public class UserAccount {
	private String acctNo, acctHolderContact, acctHolderName, acctHolderAddr;
	
	public UserAccount(String acctNo, String acctHolderName, String acctHolderContact, String acctHolderAddr) {
		this.acctNo = acctNo;
		this.acctHolderContact = acctHolderContact;
		this.acctHolderName = acctHolderName;
		this.acctHolderAddr = acctHolderAddr;
	}
	
	public UserAccount() {
		// TODO Auto-generated constructor stub
	}

	public String getAcctNo() {
		return acctNo;
	}
	
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	
	public String getAcctHolderContact() {
		return acctHolderContact;
	}
	
	public void setAcctHolderContact(String acctHolderContact) {
		this.acctHolderContact = acctHolderContact;
	}
	
	public String getAcctHolderName() {
		return acctHolderName;
	}
	
	public void setAcctHolderName(String acctHolderName) {
		this.acctHolderName = acctHolderName;
	}
	
	public String getAcctHolderAddr() {
		return acctHolderAddr;
	}
	
	public void setAcctHolderAddr(String acctHolderAddr) {
		this.acctHolderAddr = acctHolderAddr;
	}
}
