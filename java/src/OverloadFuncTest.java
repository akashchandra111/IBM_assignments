class OverloadFuncTest	{
	public static void main(String... args)	{
		new OverloadFuncTest().some(new Integer(12));
		new OverloadFuncTest().some(new Float(12.0));
	}

	void some(Long l)	{
		System.out.println("long called");
	}

	void some(Float f)	{
		System.out.println("float called");
	}

	void some(Integer i)	{
		System.out.println("int called");
	}
}
