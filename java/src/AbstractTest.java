//////////////////////////////
//							//
//	Animal <- Dog <- Pug	//
//							//
//////////////////////////////

//Abstract class can have zero, one or more abstract methods
//They can have their constructors
//You can call the implemented overridden functionality of parent just by using super.functionName()

//Constructor call their parent constructor from the first line implicitly
//If you want to call them explicitly call them on first line

abstract class Animal	{
	Animal()	{
		System.out.println("Animal called");
	}
	public void say()	{
		System.out.println("I am animal");
	}
}

abstract class Dog extends Animal	{
	Dog()	{
		System.out.println("Dog called");
	}
	void bark()	{
		System.out.println("I bark!");
	}
}

class Pug extends Dog	{
	Pug()	{
		System.out.println("Pug called");
	}
	@Override
	void bark()	{
		System.out.println("I bark like a pug!");
	}
}

class AbstractTest	{
	public static void main(String... args)	{
		Pug tom = new Pug();
		tom.bark();
		tom.say();
	}
}
