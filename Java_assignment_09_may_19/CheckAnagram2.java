import java.util.Scanner;
import java.util.Arrays;

class CheckAnagram2	{
	public static void main(String... args)	{
		System.out.print("Enter word 1: ");
		String compareTo = new Scanner(System.in).nextLine();

		System.out.print("Enter word 2: ");
		String compareWith = new Scanner(System.in).nextLine();

		if(CheckAnagram2.CheckAnagram(compareTo, compareWith))	System.out.println("Both words are anagram to one another!");
		else System.out.println("Both words are not anagram to one another!");
	}

	public static boolean CheckAnagram(String str1, String str2)	{
		if(str1.length() != str2.length())	return false;

		char[] str1Array = str1.toCharArray();
		char[] str2Array = str2.toCharArray();
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);

		for(int i=0; i<str1Array.length; ++i)	{
			if(str1Array[i] != str2Array[i])	return false;
		}

		return true;
	}
}
