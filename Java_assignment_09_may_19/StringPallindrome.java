import java.util.Scanner;

class StringPallindrome	{
	public static String checkPallindrome(String stringToScan)	{
		for(int i=0; i<stringToScan.length()/2; ++i)	{
			if(stringToScan.charAt(i) == stringToScan.charAt(stringToScan.length()-i-1))	continue;
			else	{
				return "Not a pallindrome";
			}
		}
		return "A Pallindrome";
	}

	public static void main(String... args)	{
		System.out.println("Enter string: ");
		String stringToScan = new Scanner(System.in).nextLine();
		System.out.println(StringPallindrome.checkPallindrome(stringToScan));
	}
}
