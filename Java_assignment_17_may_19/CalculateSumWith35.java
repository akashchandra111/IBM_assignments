
class CalculateSumWith35	{
	public static Integer calculateSum(int limit)	{
		int sum=0;
		for(int i=0; i<=limit; ++i)	{
			if(i%3==0 || i%5==0)	{
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String... args)	{
		boolean errorOccured = false;
		java.util.Scanner scan = new java.util.Scanner(System.in);

		do	{
			try	{
				System.out.print("Enter limit: ");
				String limit = scan.nextLine();

				System.out.println("Sum of 3 and 5 divisible element is: " + CalculateSumWith35.calculateSum(Integer.parseInt(limit)));

				errorOccured = false;
			}
			catch(NumberFormatException nfe)	{
				System.out.println(nfe);
				errorOccured = true;
			}
		}
		while(errorOccured == true);
	}
}
