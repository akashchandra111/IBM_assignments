package com.ibm.eis.service;

import com.ibm.eis.bean.Employee;
import com.ibm.eis.service.EmployeeService;
import com.ibm.eis.dao.DAO;

public class EmployeeServiceClass implements EmployeeService	{

	private DAO dataAccessObject = new DAO();
	
	public void addUserDetail(int id, String name, int salary, String designation)	{
		Employee emp = new Employee(id, name, salary, designation);
		
		emp.setInsuranceScheme(EmployeeServiceClass.calculateInsuranceScheme(emp));
		//hMap.put(emp.getId(), emp);
		dataAccessObject.addUser(emp.getId(), emp);
	}
	
	public static String calculateInsuranceScheme(Employee emp)	{
		if (emp.getSalary()>5000 && emp.getSalary()<20000 && emp.getDesignation().equals("System Associate"))	{
			return "Scheme C";
		}
		else if (emp.getSalary()>=20000 && emp.getSalary()<40000 && emp.getDesignation().equals("Programmer"))	{
			return "Scheme B";
		}
		else if (emp.getSalary()>=40000 && emp.getDesignation().equals("Manager"))	{
			return "Scheme A";
		}
		else if (emp.getSalary()<5000 && emp.getDesignation().equals("Clerk"))	{
			return "No Scheme";
		}
		else	{
			return "none";
		}
	}
	
	public String findInsuranceScheme(int salary, String designation)	{
		if (salary>5000 && salary<20000 && designation.equals("System Associate"))	{
			return "Scheme C";
		}
		else if (salary>=20000 && salary<40000 && designation.equals("Programmer"))	{
			return "Scheme B";
		}
		else if (salary>=40000 && designation.equals("Manageer"))	{
			return "Scheme A";
		}
		else if (salary<5000 && designation.equals("Clerk"))	{
			return "No Scheme";
		}
		else	{
			return "none";
		}
	}
	
	public String printEmployeeDetails(int id)	{
		Employee emp = dataAccessObject.getUserDetail(id);
		String empDetails;
		
		empDetails = "Name: " + emp.getName() + "\n";
		empDetails += "Id: " + emp.getId() + "\n";
		empDetails += "Salary: " + emp.getSalary() + "\n";
		empDetails += "Designation: " + emp.getDesignation() + "\n";
		empDetails += "Insurance Scheme: " + emp.getInsuranceScheme() + "\n";
		
		return empDetails;
	}
	
	@Override
	public String getInsuranceScheme(Employee emp) {
		return emp.getInsuranceScheme();
	}

	@Override
	public boolean validateUser(int id) {
		return dataAccessObject.validateUser(id);
	}
	
	
}
