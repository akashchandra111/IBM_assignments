import java.util.Scanner;

class CheckCharSequence	{
	public static void main(String... args)	{
		System.out.print("Enter string: ");
		String stringToCompare = new Scanner(System.in).nextLine();

		System.out.print("Enter another string to check sequence if matches: ");
		String withString = new Scanner(System.in).nextLine();

		if(CheckCharSequence.checkForSequence(stringToCompare, withString))	{
			System.out.println("Character Sequence is present in the string");
		}
		else	{
			System.out.println("Character Sequence is not present in the string");
		}
	}

	public static boolean checkForSequence(String stringToCompare, String withString)	{
		//System.out.println("stringToCompare: " + stringToCompare.length() + " withString: " + withString.length());
		for (int i=0; i<stringToCompare.length(); ++i)	{
			for (int j=0; j<withString.length(); ++j)	{
				if(stringToCompare.charAt(i) == withString.charAt(j))	{
					int k = 0;
						while((j+k < withString.length()) && withString.charAt(j+k) == stringToCompare.charAt(i+k))	{
							//System.out.println("i: " + i + " j: " + j + " k: " + k);
							++k;
							if(k == withString.length())	{
								return true;
							}
						}
				}
			}
		}
		return false;
	}
}
