import com.employee.Employee;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

import java.util.Scanner;

public class EmployeeOps	{
	public static void main(String... args)	{
		List employeeList = new ArrayList();

//		employeeList.add(new Employee("Akash Chandra", 1, 23, "bangalore"));
//		employeeList.add(new Employee("Dheeraj", 2, 23, "nakli pg"));
//		employeeList.add(new Employee("Ganesh Midar", 3, 23, "zolo"));
//		employeeList.add(new Employee("Shivam Singh", 4, 24, "gym"));
//		employeeList.add(new Employee("Nihal", 5, 23, "bangalore"));
//		employeeList.add(new Employee("Kavuri Prudvi", 6, 22, "Bangalore"));
//		employeeList.add(new Employee("Akash Singh", 7, 21, "Bangalore"));

		Integer userInput;
		String charUserInput;
		Scanner scanInput = new Scanner(System.in);

		//Entering user value
		boolean flag = true;
		do{
			System.out.println("[Y: Add User]\t [N/Other: Done adding]");
			charUserInput = scanInput.nextLine();

			switch(charUserInput)	{
				case "y":
				case "Y":
					System.out.println("Add employee details:");
					System.out.print("Enter name: ");
					String userName = scanInput.nextLine();
					System.out.print("Enter id: ");
					int id = Integer.parseInt(scanInput.nextLine());
					System.out.print("Enter age: ");
					int age = Integer.parseInt(scanInput.nextLine());
					System.out.print("Enter address: ");
					String address = scanInput.nextLine();

					employeeList.add(new Employee(userName, id, age, address));
					break;
				case "n":
				case "N":
				default:
					flag = false;
			}

		}while(flag != false);


		//Sort logic
		flag = true;
		System.out.println("Sort on basis of\n [1: First Name]\t[2: Last Name]\t[3: Id]\t[4: Age]\t[5: Address]\t[6:Exit]");
		do {
			System.out.println("Select sorting criteria: ");
			userInput = Integer.parseInt(scanInput.nextLine());
			switch(userInput)	{
				case 1:
					Collections.sort(employeeList, new FNameSortEmp());
					break;
				case 2:
					Collections.sort(employeeList, new LNameSortEmp());
					break;
				case 3:
					Collections.sort(employeeList, new IdSortEmp());
					break;
				case 4:
					Collections.sort(employeeList, new AgeSortEmp());
					break;
				case 5:
					Collections.sort(employeeList, new AddressSortEmp());
					break;
				case 6:
					flag = false;
					break;
				default:
					System.out.println("Please enter the correct option!");
			}
			for(Object obj: employeeList)	System.out.println((Employee)obj);

		} while(flag != false);
	}
}


class FNameSortEmp implements Comparator	{
	@Override
	public int compare(Object obj1, Object obj2)	{
		return ((Employee)obj1).getFirstName().compareTo(((Employee)obj2).getFirstName());
	}
}

class LNameSortEmp implements Comparator	{
	@Override
	public int compare(Object obj1, Object obj2)	{
		return ((Employee)obj1).getLastName().compareTo(((Employee)obj2).getLastName());
	}
}

class IdSortEmp implements Comparator	{
	@Override
	public int compare(Object obj1, Object obj2)	{
		return ((Employee)obj1).getId().compareTo(((Employee)obj2).getId());
	}
}

class AgeSortEmp implements Comparator	{
	@Override
	public int compare(Object obj1, Object obj2)	{
		return ((Employee)obj1).getAge().compareTo(((Employee)obj2).getAge());
	}
}

class AddressSortEmp implements Comparator	{
	@Override
	public int compare(Object obj1, Object obj2)	{
		return ((Employee)obj1).getAddress().compareTo(((Employee)obj2).getAddress());
	}
}
