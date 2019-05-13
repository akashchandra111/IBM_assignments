class ValidateAge	{
	public static void main(String... args)	{
		System.out.print("Enter age: ");
		int age = Integer.parseInt(new java.util.Scanner(System.in).nextLine());

		try	{
			if (age < 15)	throw new AgeException("Age is less than 15, it should be above it!");
			else	System.out.print("Age is fine! [Verfied]");
		}
		catch(AgeException ae)	{
			ae.printStackTrace();
		}
	}
}

class AgeException extends Exception	{
	AgeException(String s)	{
		System.out.println(s);
	}
}
