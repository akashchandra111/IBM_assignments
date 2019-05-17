import java.util.Arrays;
import java.util.Scanner;

class ModifyTheStringByWords	{
	public static void main(String... args)	{
		System.out.print("Enter string: ");
		String str = new Scanner(System.in).nextLine();

		String[] strArr = str.split(" ");
		Arrays.sort(strArr);
		for(String sortThis: strArr)	{
			System.out.println(ModifyTheStringByWords.sortWord(ModifyTheStringByWords.capitalize(sortThis)));
		}

		//System.out.println(ModifyTheStringByWords.capitalize(str));

	}

	public static String capitalize(String str)	{
		if(str.length()%2 == 0)	{
			//System.out.println("Even");
			return str.substring(0, str.length()/2).toUpperCase() + str.substring(str.length()/2).toLowerCase();
		}
		else	{
			//System.out.println("Odd");
			return str.substring(0, str.length()/2 + 1).toUpperCase() + str.substring(str.length()/2 + 1).toLowerCase();
		}
	}

	public static String sortWord(String word)	{
		Character[] charArray = new Character[word.length()];
		String returnThis = "";

		for(int i=0; i<word.length(); ++i)	charArray[i] = word.charAt(i);

		Arrays.sort(charArray);

		for(Character c: charArray)	returnThis += c.toString();

		return returnThis;
	}
}
