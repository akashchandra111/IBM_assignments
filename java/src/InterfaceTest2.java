class InterfaceTest2	{
	public static void main(String[] args) {
		Dog doggo = new Puppy();
		Dog dog = new Dog()	{
			public void bark()	{
				System.out.println("Anonymous dog: bark");
				sleep();
			}

			public void sleep()	{
				System.out.println("Anonymous dog: sleep");
			}
		};

		//	dog.sleep();	Won't work outside class because it was not present in the Dog class previously
		//	How would you access as object is of Dog and extended class is anonymous
		//	Same is with interface

		Ferrari myFerrari = new Ferrari()	{
			String carStmt = "hi this is my car";
			public void race()	{
				System.out.println("anonymous: race, carStmt: " + carStmt);
			}

			// public void getCarName()	{
			// 	System.out.println(carName);
			// }

			public void nMethod()	{
				System.out.println("anonymous: nMethod");
			}

			public void newMethod()	{
				System.out.println("anonymous: newMethod");
			}
		};

		myFerrari.newMethod();
		myFerrari.race();
		myFerrari.getCarName();
	}
}

abstract class Dog	{

	public Dog()	{
		bark();
	}

	//public abstract void bark();
	 public void bark()	{
	 	System.out.println("Dog: bark");
	 }
}

class Puppy extends Dog	{
	public void bark()	{
		System.out.println("Puppy: bark");
	}
}

interface Car	{
 	String carName = "This is my car";

	// public default Car()	{
	// 	System.out.println("This is car interface");
	// }

	// default void race()	{
	// 	//carName = "";
	// 	System.out.println("interface: car race");
	// }
}

interface Ferrari extends Car	{
	abstract void newMethod();
	abstract void race();
	//abstract void notUsed();

	default void getCarName()	{
		System.out.println(carName);
	}
}
