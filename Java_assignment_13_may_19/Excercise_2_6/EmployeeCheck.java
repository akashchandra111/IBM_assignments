import com.cg.eis.employee.EmployeeException;

class EmployeeCheck	{
	public static void main(String... args)	{
		System.out.print("Enter user salary: ");
		int salary = Integer.parseInt(new java.util.Scanner(System.in).nextLine());

		try	{
			EmployeeCheck.checkException(salary);
		}
		catch(EmployeeException ese)	{
			System.out.println(ese);
		}
	}

	public static void checkException(int salary) throws EmployeeException	{
		if(salary < 3000)	throw new EmployeeException("Employee salary is less than 3000");
		else	System.out.println("Salary is fine!");
	}
}
