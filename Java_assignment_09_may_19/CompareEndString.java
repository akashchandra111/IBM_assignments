import java.util.Scanner;

class CompareEndString	{
	public static void main(String... args)	{
		System.out.print("Enter string: ");
		String stringToCheck = new Scanner(System.in).nextLine();
		System.out.print("Enter other string: ");
		String withString = new Scanner(System.in).nextLine();

		for(int i=0; i<withString.length(); ++i)	{
			if(stringToCheck.charAt(stringToCheck.length()-i-1) == withString.charAt(withString.length()-i-1))	continue;
		 	else	{
				System.out.println("String not present at back");
				return;
			}
		}
		System.out.println("String present at back");
	}
}
