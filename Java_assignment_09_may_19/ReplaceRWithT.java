import java.util.Scanner;

class ReplaceRWithT	{
	public static void main(String... args)	{
		System.out.print("Enter String: ");
		String stringToModify = new Scanner(System.in).nextLine();
		stringToModify = stringToModify.replaceAll("r", "t");
		System.out.println("New String: " + stringToModify);
	}
}
