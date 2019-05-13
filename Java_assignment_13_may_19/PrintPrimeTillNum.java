class PrintPrimeTillNum	{
	public static void main(String... args)	{
		System.out.print("Enter number: ");
		int checkTill = Integer.parseInt(new java.util.Scanner(System.in).nextLine());

		//if(PrintPrimeTillNum.checkPrime(checkTill))	System.out.print("Prime!");

		int temp = 0;
		while(checkTill > temp)	{
			if (PrintPrimeTillNum.checkPrime(temp))	System.out.print((temp) + " ");
			temp++;
		}

	}

	public static boolean checkPrime(int num)	{
		int counter = 0;
		//System.out.println("Math.sqrt: " + (int)Math.sqrt(num));
		for(int i=1; i<=num; ++i)	{
			if(num%i == 0) counter++;
		}

		//System.out.println(counter);
		if(counter == 2)	return true;
		else	return false;
	}
}
