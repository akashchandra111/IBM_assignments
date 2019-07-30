interface Human	{
	public void breathe();
	public void say();
	public void walk();
}

class Akash implements Human	{
	@Override
	public void breathe()	{
		System.out.println("Akash: breathe");
	}

	@Override
	public void say()	{
		System.out.println("Akash: say");
	}

	@Override
	public void walk()	{
		System.out.println("Akash: walk");
	}
}

class InterfaceTest	{
	public static void main(String... args)	{
		Human akash = new Akash();
		akash.breathe();
		akash.walk();
		akash.say();
	}
}
