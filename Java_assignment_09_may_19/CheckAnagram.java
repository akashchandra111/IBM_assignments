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
		boolean hasSkipped;
		for(int j=0; j<str2.length(); ++j)	{
			hasSkipped = false;
			for(int i=0; i<str1.length(); ++i)	{
				System.out.println("str1: " + str1.charAt(j) + " str2: " + str2.charAt(i));
				if (str2.charAt(i) == ' ') continue;
				else if(str1.charAt(i) == str2.charAt(j))	{
					hasSkipped = true;
					continue;
				}
			}

			if(str2.charAt(j) == ' ')	continue;

			if(hasSkipped = true)	{
				continue;
			}
			else return false;
		}
		return true;
	}
}
