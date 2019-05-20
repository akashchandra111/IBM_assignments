package com.ibm.eis.service;

import com.ibm.eis.bean.Employee;

public interface EmployeeService {
	public abstract String getInsuranceScheme(Employee emp);
	public abstract String findInsuranceScheme(int salary, String designation);
}
