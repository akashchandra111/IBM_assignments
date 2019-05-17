import java.util.StringTokenizer;
import java.util.Scanner;

class SumEnteredToken	{
	public static void main(String[] args) {

		boolean catchCalled = false;

		do {
			System.out.print("Enter numbers continuously to add: ");
			String strToTokenize = new Scanner(System.in).nextLine();
			try	{
					StringTokenizer tokens = new StringTokenizer(strToTokenize, " ");

					Integer sum = 0;
					while(tokens.hasMoreTokens())	{
						Integer currentVal = Integer.parseInt(tokens.nextToken());
						System.out.println("Integer: " + currentVal);
						sum += currentVal;
					}
					System.out.println("Total sum is: " + sum);
					catchCalled = false;
			}
			catch(NumberFormatException e)	{
				System.out.println(e);
				System.out.println("You might not be using correct integer/delimiter");
				catchCalled = true;
			}
		}while(catchCalled == true);
	}
}
