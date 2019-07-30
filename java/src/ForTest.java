class ForTest	{
	public static void main(String... args)	{
		Person[] persons = {
			new Person("akash chandra"), new Person("akash verma"), new Person("akash sharma"), new Person("akash gupta"), new Person("akash pandey")
		};

		for (Person p: persons)	{
			p.printName();
		}
	}
}

class Person	{
	private String name;
	private static int length;

	static	{
		Person.length++;
	}

	public Person(String name)	{
		this.name = name;
		++Person.length;
	}

	public void printName()	{
		System.out.println("Person Name: " + this.name);
	}

	public static int totalHumansCreated()	{
		return Person.length;
	}
}
