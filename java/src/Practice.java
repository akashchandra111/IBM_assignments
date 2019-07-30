class Practice	{
	public static void main(String[] args) {
		//System.out.println(X.printThis);
		//System.out.println(X.return10());

		X x = ()-> {return 30;};
		System.out.println(x.return20());

		// System.out.println(new X(){public int return20()	{return 30;}}.return20());
		// System.out.println(new X(){}.return20());
	}
}

interface X	{
	public static final String printThis = "Print this X";

	public static int return10()	{
		return 10;
	}

	abstract int return20();

	// public default int return20()	{
	// 	return 20;
	// }
}

// class Y implements X	{
// 	public static int return10()	{
// 		System.out.println("Y::X return10(): Returning 10");
// 		return 10;
// 	}
// }
