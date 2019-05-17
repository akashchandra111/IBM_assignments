import java.util.Scanner;

class FindDigitCubedSum	{
	public static void main(String[] args) {

		boolean errorOccured = false;
		do {
			try 	{
				System.out.print("Enter number to find it's digit cubed sum: ");
				int num = Integer.parseInt(new Scanner(System.in).nextLine());

				int sum=0;
				while(num != 0)	{
					sum += (num%10)*(num%10)*(num%10);
					num /= 10;
				}
				System.out.println("Sum is: " + sum);
				errorOccured = false;
			}
			catch(NumberFormatException nfe)	{
				System.out.println("You should pass a number");
				System.out.println(nfe);
				errorOccured = true;
			}
		}
		while(errorOccured == true);
	}
}
