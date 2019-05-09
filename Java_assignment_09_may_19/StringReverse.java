import java.util.Scanner;

class StringReverse	{
	public static void main(String... args)	{
		System.out.print("Enter string to reverse: ");
		String strToRev = new Scanner(System.in).nextLine();

		for(int i=0; i<strToRev.length(); ++i)	{
			System.out.print(strToRev.charAt(strToRev.length()-1-i));
		}
		System.out.println();
	}
}
