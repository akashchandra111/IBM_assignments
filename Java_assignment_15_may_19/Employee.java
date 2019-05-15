package com.employee;

public class Employee	{
	private String name, address;
	private int id, age;

	public Employee(String name, int id, int age, String address)	{
		this.name = name;
		this.id = id;
		this.age = age;
		this.address = address;
	}

	public Employee()	{
		this.name = this.address = "";
		this.id = this.age = 0;
	}

	//Getters
	public String getFirstName()	{
		return this.name.split(" ")[0];
	}

	public String getLastName()	{
	//	try	{
	//		return this.name.split(" ")[1];
	//	}
	//	catch(Exception e)	{
	//		//System.out.println("Last name is not present!");
	//		return " ";
	//	}

		if(this.name.indexOf(' ') != -1)	return this.name.substring(this.name.indexOf(' ')+1);
		else	return " ";
	}

	public Integer getAge()	{
		return this.age;
	}

	public Integer getId()	{
		return this.id;
	}

	public String getAddress()	{
		return this.address;
	}

	@Override
	public String toString()	{
		return "Name: " + this.name + " age: " + this.age + " id: " + this.id + " address: " + this.address;
	}
}
