class PrintPrimeTillNum	{
	public static void main(String... args)	{
		System.out.print("Enter number: ");
		int checkTill = Integer.parseInt(new java.util.Scanner(System.in).nextLine());

		//if(PrintPrimeTillNum.checkPrime(checkTill))	System.out.print("Prime!");

		int temp = 0;
		while(checkTill >= temp)	{
			if (PrintPrimeTillNum.checkPrime(temp))	System.out.print((temp) + " ");
			temp++;
		}

	}

	public static boolean checkPrime(int num)	{
		//int counter = 0;
		//System.out.println("Math.sqrt: " + (int)Math.sqrt(num));
		if(num==0 || num==1)	return false;

		for(int i=2; i<=(int)Math.sqrt(num); ++i)	{
			if(num%i == 0)	return false;
		}
		return true;
	}
}
