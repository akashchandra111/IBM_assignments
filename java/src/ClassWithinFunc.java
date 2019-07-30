class Parent	{
	public int x;
	private int y;
	protected int z;
	static int a;

	public void func1()	{
		class Child1	{
			final public int c1X=1;
			final private int c1Y=2;
			final protected int c1Z=3;
			//static int c1A;

			public void c1fun1()	{
				System.out.println("[Modification is not allowed] Final vars: " + this.c1X + " " + this.c1Y + " " + this.c1Z);
			}

			//public static void c1fun2()	{
			//	System.out.println(Child2.c1A);
			//}
		}

		new Child1().c1fun1();
	}

	public static void func2()	{
		class Child2	{
			public int c2X=1;
			private int c2Y=2;
			protected int c2Z=3;
			//static int c2A;

			public void c2fun1()	{
				c2X = 10; c2Y = 20; c2Z = 30;
				System.out.println("[Modification works here] Instance vars: " + this.c2X + " " + this.c2Y + " " + this.c2Z);
			}

			//public static void c2fun2()	{
			//	System.out.println(Child2.c2A);
			//}
		}

		new Child2().c2fun1();
	}
}

class ClassWithinFunc	{
	public static void main(String... args)	{
		Parent parent = new Parent();
		parent.func1();
		Parent.func2();
	}
}
