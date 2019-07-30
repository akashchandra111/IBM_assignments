class InheritanceTest	{
	public static void main(String... args)	{
		GermanShephardKid tom = new GermanShephardKid();
		tom.say();
		tom.greet();
	}
}

// Animal <- Dog <- GermanShephard <- GermanShephardKid

class Animal	{
	private String name="tiger";
	public void say()	{
		System.out.println("I am animal: " + getName());
	}

	public String getName()	{
		return this.name;
	}

	public void greet()	{
		System.out.println("I am animal: hello human!");
	}
}

class Dog extends Animal	{
	@Override
	public void say()	{
		System.out.println("I Bark");
	}

	@Override
	public void greet()	{
		System.out.println("I am Dog: hello human!");
	}
}

class GermanShephard extends Dog	{
	@Override
	public void say()	{
		System.out.println("I bark louder");
	}

	@Override
	public void greet()	{
		System.out.println("I am GermanShephard: hello human!");
	}
}

class GermanShephardKid extends GermanShephard	{
	@Override
	public void say()	{
		System.out.println(getName() + ": I bark slowly");
	}
}
