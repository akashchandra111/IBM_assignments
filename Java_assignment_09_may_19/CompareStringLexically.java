import java.util.Scanner;

class CompareStringLexically	{
	public static void main(String... args)	{
		System.out.print("Enter string 1: ");
		String str1 = new Scanner(System.in).nextLine();
		System.out.print("Enter string 2: ");
		String str2 = new Scanner(System.in).nextLine();

		if(CompareStringLexically.compareLexically(str1, str2) == -1)	System.out.println("String 1 is greater");
		else if (CompareStringLexically.compareLexically(str1, str2) == 1)	System.out.println("String 2 is greater");
		else if (CompareStringLexically.compareLexically(str1, str2) == 0)	System.out.println("Both strings are equal");
		else	{
			System.out.println("String have same length but are not lexographically symmetrical");
		}

	}

	public static byte compareLexically(String compareTo, String compareWith)	{
		String[] compareToArr = compareTo.split(" ");
		String[] compareWithArr = compareWith.split(" ");

		if(compareTo.length() > compareWith.length())	{
			return -1;
		}
		else if(compareTo.length() < compareWith.length())	{
			return 1;
		}
		else	{
			boolean pass = true;
			for(int i=0; i<compareToArr.length; ++i)	{
				if(compareToArr[i].equalsIgnoreCase(compareWithArr[i])) pass = true;
				else pass = false;
			}
			if(pass)	return 0;
			else return 10;
		}
	}
}
