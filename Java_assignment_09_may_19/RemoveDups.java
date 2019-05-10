import java.util.Scanner;

class RemoveDups	{
	public static void main(String... args)	{
		String checkString = new Scanner(System.in).nextLine();
		String strToPrint = "";

		for(int i=0; i<checkString.length(); ++i)	{
			if(!strToPrint.contains(String.valueOf(checkString.charAt(i))))	strToPrint += String.valueOf(checkString.charAt(i));
		}
		System.out.print(strToPrint);
	}
}
