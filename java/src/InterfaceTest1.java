class InterfaceTest1	{
	public static void main(String... args)	{
		Akash a = new Akash();

		a.sayName1();
		a.sayAnything();
	}
}

interface Human	{
 	public static String name="Human";
	default public void sayName()	{
		System.out.println("Name is: " + Human.name);
	}
	default public void sayName1()	{
		sayName();
	}
	public void sayName2();
}

abstract class Student implements Human	{
	public void sayAnything()	{
		System.out.println("Student: I am student");
	}
	private int x;
	public int getX()	{
		return x;
	}
}

class Akash extends Student	{
	@Override
	public void sayName2()	{

	}
}
