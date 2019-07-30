class Parent	{
	public int x;
	private int y;
	protected int z;
	static int a;

	static	{
		System.out.println("Another static block [First]");
	}

	class Child	{
		public int cX;
		private int cY;
		protected int cZ;
		//static int cA;

		public void printXYZ()	{
			System.out.println("cX: " + this.cX + " cY: " + this.cY + " cZ: " + this.cZ);
		}

		//public static void printA()	{
		//	System.out.println(Child.cA);
		//}
	}

	static class Child2	{
		static private int c2X;
		static private int c2Y;

		public static void printChild2()	{
			c2X = c2Y = 20;
			System.out.println("c2X: " + Parent.Child2.c2X + " c2Y: " + Parent.Child2.c2Y);
		}
	}

	static	{
		System.out.println("Static This Block [Last]");
	}
}

class InnerClass	{
	public static void main(String... args)	{
		Parent.Child child = new Parent().new Child();
		Parent.Child2.printChild2();
		child.printXYZ();
		//Parent.Child.printA();
	}
}
