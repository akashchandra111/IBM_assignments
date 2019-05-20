// Uploading this code to github
package com.ibm.eis.ui;

import java.util.Scanner;

import com.ibm.eis.service.EmployeeServiceClass;

public class UserInterface {
	
	private static EmployeeServiceClass esc = new EmployeeServiceClass();
	
	public static void main(String... args)	{
		boolean errorOccured = false;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("<<<Insurance Scheme Calculator and simulator>>>");
		do	{
			try	{
				System.out.println("Please select your options:");
				System.out.println("[1: Enter employee Details]\n[2: Get employee Details]\n[3: Calculate insurance Scheme]\n[4: To exit!]");
				int option = Integer.parseInt(scan.nextLine());
				
			
				switch(option)	{
					case 1:
						UserInterface.addUserDetails();
						errorOccured = true;
						break;
					case 2:
						UserInterface.getUserDetails();
						errorOccured = true;
						break;
					case 3:
						UserInterface.getInsuranceScheme();
						errorOccured = true;
						break;
					case 4:
						errorOccured = false;
						break;
					default: 
						System.out.println("Wrong Input, try again!");
						errorOccured = true;
						break;
				}
				
			}
			catch(NumberFormatException nfe)	{
				System.out.println(nfe);
				errorOccured = true;
			}
		
		}
		while(errorOccured == true);
	}
	
	public static void addUserDetails() throws NumberFormatException	{
		Scanner scan = new Scanner(System.in);
		try	{
			System.out.print("Enter Name: ");
			String name = scan.nextLine();
			
			int id=0;
			boolean notValidated = false;
			do	{
				System.out.print("Enter ID: ");
				if (notValidated)	System.out.print("again!: ");
				id = Integer.parseInt(scan.nextLine());
			}
			while(esc.validateUser(id) && (notValidated=true));
			
			
			System.out.print("Enter Salary: ");
			int salary = Integer.parseInt(scan.nextLine());
			
			System.out.print("Select Designation: \n[1: System Associate]\n[2: Programmer]\n[3: Manager]\n[4: Clerk]");
			String designation = "none";
			
			switch(Integer.parseInt(scan.nextLine()))	{
				case 1:
					designation = "System Associate";
					break;
				case 2:
					designation = "Programmer";
					break;
				case 3:
					designation = "Manager";
					break;
				case 4:
					designation = "Clerk";
					break;
				default:
					System.out.println("Wrong input provided");
			}
			esc.addUserDetail(id, name, salary, designation);
		}
		catch(NumberFormatException nfe)	{
			throw nfe;
		}
	}
	
	public static void getUserDetails() throws NumberFormatException	{
		Scanner scan = new Scanner(System.in);
		try	{
			System.out.print("Enter id: ");
			int id = Integer.parseInt(scan.nextLine());
			System.out.println(esc.printEmployeeDetails(id));
		}
		catch(NumberFormatException nfe)	{
			throw nfe;
		}
		finally	{
			scan.close();
		}
	}
	
	public static void getInsuranceScheme() throws NumberFormatException	{
		Scanner scan = new Scanner(System.in);
		try	{
			System.out.print("Enter salary: ");
			int salary = Integer.parseInt(scan.nextLine());
			
			System.out.println("Select Designation:\n[1: System Associate]\n[2: Programmer]\n[3: Manager]\n[4: Clerk]");
			
			switch(Integer.parseInt(scan.nextLine()))	{
				case 1:
					System.out.println("Suitable Scheme: " + esc.findInsuranceScheme(salary, "System Associate"));
					break;
				case 2:
					System.out.println("Suitable Scheme: " + esc.findInsuranceScheme(salary, "Programmer"));
					break;
				case 3:
					System.out.println("Suitable Scheme: " + esc.findInsuranceScheme(salary, "Manager"));
					break;
				case 4:
					System.out.println("Suitable Scheme: " + esc.findInsuranceScheme(salary, "Clerk"));
					break;
				default:
					throw new NumberFormatException();
			}
		}
		catch(NumberFormatException nfe)	{
			throw nfe;
		}
		finally	{
			scan.close();
		}
	}
}
