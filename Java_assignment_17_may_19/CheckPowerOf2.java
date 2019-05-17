class CheckPowerOf2	{
	public static void main(String[] args) {
		boolean errorOccured = false;
		java.util.Scanner scan = new java.util.Scanner(System.in);

		do	{
			try	{
				System.out.print("Enter number to check (if power of 2): ");
				Integer num = Integer.parseInt(scan.nextLine());

				if(CheckPowerOf2.checkPower(num))	System.out.println("Number is in power of 2");
				else	System.out.println("Number is not in power of 2");

				errorOccured = false;
			}
			catch(NumberFormatException nfe)	{
				System.out.println(nfe);
				errorOccured = true;
			}
		}
		while(errorOccured == true);
	}

	public static boolean checkPower(int num)	{
		while(num!=0 && num!=1)	{
			if(num%2 != 0)	{
				return false;
			}
			else	{
				//System.out.println(num);
				num /= 2;
			}
		}
		if(num == 1)	return true;
		else	return false;
	}
}
