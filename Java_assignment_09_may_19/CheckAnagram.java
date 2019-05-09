import java.util.Scanner;

class CheckAnagram	{
	public static void main(String... args)	{
		System.out.print("Enter sentence/word 1: ");
		String str1 = new Scanner(System.in).nextLine();

		System.out.print("Enter sentence/word to check whether it is anagram: ");
		String str2 = new Scanner(System.in).nextLine();

		if(checkForAnagram(str1, str2))	{
			System.out.println("[Yes] it is anagram!");
		}
		else	{
			System.out.println("[No] it is not anagram!");
		}
	}

	public static boolean checkForAnagram(String str1, String str2)	{
		// Create an array for distinct alphabet
		int anagramSize = str2.length();
		for(int i=0; i<str2.length(); ++i)	{
			for(int j=0; j<str1.length(); ++j)	{
				if(str1.charAt(j) == str2.charAt(i))	--anagramSize;
				if(anagramSize == 0)	return true;
			}
		}
		return false;
	}
}
