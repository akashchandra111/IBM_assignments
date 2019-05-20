package com.ibm.eis.dao;

import com.ibm.eis.dao.DAOInterface;
import com.ibm.eis.bean.Employee;

import java.util.HashMap;

public class DAO implements DAOInterface {

	HashMap<Integer, Employee> hMap = new HashMap<>();
	
	@Override
	public void addUser(int id, Employee emp) {
		hMap.put(id, emp);
		System.out.println("User Added!");
	}

	@Override
	public Employee getUserDetail(int id) {
		return hMap.get(id);
	}

	@Override
	public boolean validateUser(int id)	{
		if(hMap.containsKey(id))	return true;
		else	return false;
	}
}
