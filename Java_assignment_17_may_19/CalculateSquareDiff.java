class CalculateSquareDiff	{
	public static void main(String[] args) {
		boolean errorOccured = false;
		java.util.Scanner scan = new java.util.Scanner(System.in);

		do	{
			try	{
				System.out.print("Enter number: ");
				Integer limit = Integer.parseInt(scan.nextLine());

				System.out.println("Difference is: " + CalculateSquareDiff.calcDiff(limit));

				errorOccured = false;
			}
			catch(NumberFormatException nfe)	{
				System.out.println(nfe);
				errorOccured = true;
			}
		}
		while(errorOccured == true);
	}

	public static Integer calcDiff(Integer limit)	{
		int incr=0, squaredSum=0, sum=0;
		while(limit != 0)	{
			incr += 1;
			sum += incr;
			squaredSum += incr*incr;
			//System.out.println("sum: " + sum + " squaredSum: " + squaredSum + " incr: " + incr);
			--limit;
		}
		return (sum*sum)-squaredSum;
	}
}
