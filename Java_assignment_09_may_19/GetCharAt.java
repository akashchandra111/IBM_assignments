import java.util.Scanner;

class GetCharAt	{
	public static void main(String... args)	{
		System.out.print("Enter string: ");
		String searchInThisString = new Scanner(System.in).nextLine();

		System.out.print("Enter index to get it's character: ");
		int index = new Scanner(System.in).nextInt();

		System.out.println("Character got: '" + GetCharAt.getCharAtIndex(searchInThisString, index) + "'");
	}

	public static char getCharAtIndex(String str, int index)	{
		if (index >= str.length()) return '\0';
		char[] charArray = str.toCharArray();
		for(int i=0; i<charArray.length; ++i)	{
			//System.out.println(charArray[i]);
			if(i == index)	return charArray[i];
		}

		return '\0';
	}
}
