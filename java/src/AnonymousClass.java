class AnonymousClass	{
	public static void main(String... args)	{
		RemoteControl remote = new RemoteControl();

		//What is happening here is we are declaring the class anonymously and we are assigning the object to the interface
		//to achieve run-time polymorphism and to do that we just declare it like a function [something like the anonymous function in javascript]
		remote.controlRemote(
			new Remote()	{
				@Override
				public void doSomething()	{
					System.out.println("Something works!");
				}
			});
	}
}

interface Remote	{
	public void doSomething();
}

class RemoteControl	{
	public void controlRemote(Remote rem)	{
		rem.doSomething();
	}
}
