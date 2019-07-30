class StaticAndLocal	{
	private static int staticVar;

	public static void main(String... args)	{

		System.out.println("StaticAndLocal.staticVar: " + StaticAndLocal.staticVar);
		System.out.println("new StaticAndLocal(): " + new StaticAndLocal());

		//Checking the changes made by non-static function
		new StaticAndLocal().checkingStaticMem();
		System.out.println("StaticAndLocal.staticVar: " + StaticAndLocal.staticVar);

		{
			StaticAndLocal sc = new StaticAndLocal();
		}
		{
			StaticAndLocal sc = new StaticAndLocal();
		}
	}

	public void checkingStaticMem()	{
		this.staticVar = 10;
		StaticAndLocal.staticVar = 20; //Same as above implicitly it replaces the object name with class name
		staticVar = 30;
	}
}
