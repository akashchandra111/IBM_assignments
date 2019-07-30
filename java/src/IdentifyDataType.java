import java.util.Scanner;

class IdentifyDataType	{
	public static void main(String... args)	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter input: ");
		String checkItsType = scan.nextLine();

		System.out.println(checkItsType + ": "+ checkItsType.split("\\.").length);

		if(checkItsType.split("\\.").length > 2)	{
			System.out.println("It cannot be a float/double/integer number");
		}
		else if((checkItsType.matches("-?\\d+\\.*\\d+?")) == true)	{
			System.out.println("It's a number");
			if(checkItsType.split("\\.").length == 2)	{
				System.out.println("[float/double]");
			}
			else System.out.println("[integer]");
		}
		else	{
			System.out.println("It is a [String]");
		}
	}
}
