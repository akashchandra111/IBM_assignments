import java.util.Arrays;

class SortReversedIntArray	{
	public static void main(String... args)	{
		boolean errorOccured = false;
		Scanner scan = new Scanner(System.in);

		do {
			try	{
				System.out.print("Enter the integer values to sort (with spaces): ")
				String divideThisToInt = scanner.nextLine();
				String[] 

				errorOccured = false;
			}
			catch(NumberFormatException nfe)	{
				errorOccured = true;
			}
		}
		while(errorOccured == true);

	}
}
