class CheckName	{
	public static void main(String... args)	{
		System.out.print("Enter employee firstName: ");
		String firstName = new java.util.Scanner(System.in).nextLine();
		System.out.println("Enter employee lastName: ");
		String lastName = new java.util.Scanner(System.in).nextLine();

		try	{
			if(firstName.equals("")) throw new MyException("First name is not provided!");
			else if(lastName.equals("")) throw new MyException("Last name is not provided!");
			else System.out.println("Everything is right!");
		}
		catch(Exception e)	{
			e.printStackTrace();
			//throw e;
		}
	}
}

class MyException extends Exception	{
	MyException(String s)	{
		System.out.println(s);
	}
}
