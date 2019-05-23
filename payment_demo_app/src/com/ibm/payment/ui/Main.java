package com.ibm.payment.ui;

import com.ibm.payment.bean.UserAccount;
import com.ibm.payment.dao.DAOWallet;

public class Main {

	public static void main(String[] args) {
		
		DAOWallet dw = new DAOWallet();
		
		dw.createConnection("bank_wallet", "root", "");
		
		System.out.println(dw.get("users_logs", "12395481", "message"));
	}

}
