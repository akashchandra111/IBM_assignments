class ReturnSmallestInArray	{
	public static void main(String[] args) {
		boolean errorOccured = false;
		java.util.Scanner scan = new java.util.Scanner(System.in);

		do {
			try	{
				System.out.print("Enter elements:");
				String str = scan.nextLine();

				String[] arrContainer = str.split(" ");

				System.out.println("Second Smallest Element: " + ReturnSmallestInArray.getSecondSmallest(arrContainer));

				errorOccured = false;
			}
			catch(NumberFormatException nfe)	{
				System.out.println(nfe);
				errorOccured = true;
			}
		}
		while(errorOccured == true);
	}

	public static int getSecondSmallest(String[] arrContainer) throws NumberFormatException	{
		Integer[] intContainer = new Integer[arrContainer.length];

		for(int i=0; i<intContainer.length; ++i)	intContainer[i] = Integer.parseInt(arrContainer[i]);

		java.util.Arrays.sort(intContainer);
		return intContainer[1];
	}
}
