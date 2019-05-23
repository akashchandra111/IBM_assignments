package com.ibm.payment.bean;

public class UserAccount {
	private long acctNo, acctHolderContact;
	String acctHolderName, acctHolderAddr;
	
	public UserAccount(long acctNo, String acctHolderName, long acctHolderContact, String acctHolderAddr) {
		this.acctNo = acctNo;
		this.acctHolderContact = acctHolderContact;
		this.acctHolderName = acctHolderName;
		this.acctHolderAddr = acctHolderAddr;
	}
	
	public long getAcctNo() {
		return acctNo;
	}
	
	public void setAcctNo(long acctNo) {
		this.acctNo = acctNo;
	}
	
	public long getAcctHolderContact() {
		return acctHolderContact;
	}
	
	public void setAcctHolderContact(long acctHolderContact) {
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
