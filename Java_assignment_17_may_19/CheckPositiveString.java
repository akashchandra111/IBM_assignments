

class CheckPositiveString	{
	public static void main(String[] args) {
		do {
			System.out.print("[Type exit to break] Enter string: ");
			String strToCheck = new java.util.Scanner(System.in).nextLine();
			if(strToCheck.equals("exit"))	break;

			if(CheckPositiveString.checkStr(strToCheck))	System.out.println("String is positive type!");
			else	System.out.println("String is not positive type");
		} while (true);
		System.out.println("Program is terminated now!");
	}

	public static boolean checkStr(String strToCheck)	{
		int lengthOfStr = strToCheck.length();
		int counter = 0;
		int prevCharVal = 0;

		while(counter != lengthOfStr)	{
			if((int)strToCheck.charAt(counter) > prevCharVal)	{
				prevCharVal = (int)strToCheck.charAt(counter);
			}
			else	return false;

			++counter;
		}
		return true;
	}
}
