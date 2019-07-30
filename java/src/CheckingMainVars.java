class CheckingMainVars	{
	static byte b=123;
	int newint=12345;
	public int ret()	{
		int x=1;
		return x;
	}
	public static void main(String... args)	{
		CheckingMainVars cMV = new CheckingMainVars();
		System.out.println("Byte b: " + CheckingMainVars.b);
		System.out.println("Int newint: " + cMV.newint);
		System.out.println("int ret(): " + cMV.ret());
	}
}
