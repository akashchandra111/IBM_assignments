import java.util.Scanner;

class GetInitials	{
	public static void main(String... args)	{
		System.out.print("Enter your name: ");
		String nameHolder = new Scanner(System.in).nextLine();

		System.out.print("Your initials: ");
		for(int i=0; i<nameHolder.length(); ++i)	{
			if((i != 0) && (nameHolder.charAt(i-1) == ' '))	{
				System.out.print(nameHolder.charAt(i) + ". ");
				continue;
			}
			if(i == 0)	{
				System.out.print(nameHolder.charAt(i) + ". ");
			}
		}
		System.out.println();
	}
}
