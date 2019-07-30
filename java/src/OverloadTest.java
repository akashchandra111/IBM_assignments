class OverloadTest	{
	public static void main(String... args)	{
		OverloadTest overload = new OverloadTest();
		System.out.println("add(1, 3): " + overload.add(1, 3));
		System.out.println("add(1, 3, 5): " + overload.add(1, 3, 5));
		System.out.println("add(): " + overload.add());
		System.out.println("add(1): " + overload.add(1));
	}

	public int add(int... args)	{
		int sum = 0;
		for (int num: args)	{
			sum += num;
		}
		return sum;
	}
}
