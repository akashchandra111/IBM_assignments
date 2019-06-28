package com.ibm.training.UserDb;

public class User {
	public String userId, firstName, lastName, mobileNo, govtIdType, govtIdNo, drivingLicenseNo, username, password, email, wallet;
	

	public User(String userId, String firstName, String lastName, String mobileNo, String govtIdType, String govtIdNo,
			String drivingLicenseNo, String username, String password, String email, String wallet) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.govtIdType = govtIdType;
		this.govtIdNo = govtIdNo;
		this.drivingLicenseNo = drivingLicenseNo;
		this.username = username;
		this.password = password;
		this.email = email;
		this.wallet = wallet;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getGovtIdType() {
		return govtIdType;
	}

	public void setGovtIdType(String govtIdType) {
		this.govtIdType = govtIdType;
	}

	public String getGovtIdNo() {
		return govtIdNo;
	}

	public void setGovtIdNo(String govtIdNo) {
		this.govtIdNo = govtIdNo;
	}

	public String getDrivingLicenseNo() {
		return drivingLicenseNo;
	}

	public void setDrivingLicenseNo(String drivingLicenseNo) {
		this.drivingLicenseNo = drivingLicenseNo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWallet() {
		return wallet;
	}

	public void setWallet(String wallet) {
		this.wallet = wallet;
	}
	
	
}
