class CommandlineFloatAdd	{
	public static void main(String... args)	{
		if(args.length < 1)	{
			System.out.println("Usage: java CommandlineAdd arg1 [args...]");
			return;
		}
		int sum=0;
		float decimalSum=0.0f;
		for(int i=0; i<args.length; ++i)	{
			float tempFloat = Float.parseFloat(args[i]);
			sum += (int)tempFloat;
			decimalSum += tempFloat - (int)tempFloat;
		}
		System.out.printf("Sum is: (int)%d (float)%.2f", sum, decimalSum);
	}
}
