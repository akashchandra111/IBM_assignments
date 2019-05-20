package com.ibm.eis.dao;

import com.ibm.eis.bean.Employee;

public interface DAOInterface {
	public abstract void addUser(int id, Employee emp);
	public abstract Employee getUserDetail(int id);
	public abstract boolean validateUser(int id);
}
