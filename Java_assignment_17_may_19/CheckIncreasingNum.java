class CheckIncreasingNum	{
	public static void main(String[] args)	{
		java.util.Scanner scan = new java.util.Scanner(System.in);
		boolean errorOccured = false;

		do	{
			try	{
				System.out.print("Enter number to check it's order: ");
				String str = scan.nextLine();

				if(CheckIncreasingNum.checkNum(Integer.parseInt(str)))	{
					System.out.println("Number Type: increasing");
				}
				else	System.out.println("Number Type: non increasing");

				errorOccured = false;
			}
			catch(NumberFormatException nfe)	{
				System.out.println(nfe);
				errorOccured = true;
			}
		}
		while(errorOccured == true);

	}

	public static boolean checkNum(int num) throws NumberFormatException	{
		int prevNum=num%10;
		boolean value=true;
		while((num/=10) != 0)	{
			if(prevNum >= num%10);
			else	return false;
			//System.out.println("prevNum: " + prevNum + " num: " + num%10);
			prevNum = num%10;
		}
		return true;
	}
}
