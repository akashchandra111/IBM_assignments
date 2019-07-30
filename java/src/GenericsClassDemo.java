class GenericClassDemo	{
	public static void main(String... args)	{
		GenericPrinter<Animal<String>, Animal<? extends Object>> animal = new GenericPrinter<>(new Animal<>("Bhauk kutte bhauk!"));
		GenericPrinter<Animal<String>, Animal<? extends Object>> dog = new GenericPrinter<>(new Animal<String>("Bhauk"), new Animal<String>("Bhauko kutte bhauko!"));
		GenericPrinter<Phone, String> mobile = new GenericPrinter<>(new Phone("Redmi X20"));
	}
}

class GenericPrinter<AnyThing, NoThing>	{
	public GenericPrinter(AnyThing aT)	{
		System.out.println("AnyThing: " + aT);
	}

	//Wouldn't work because they have the same type of erasure
//	public GenericPrinter(NoThing nT)	{
//		System.out.println("NoThing: " + nT);
//	}

	public GenericPrinter(AnyThing aT, NoThing nT)	{
		System.out.println("NoThing: " + nT);
	}
}

class Animal<DataType>	{
	private DataType animalName;

	Animal(DataType name)	{
		this.animalName = name;
	}

	@Override
	public String toString()	{
		return "Animal: " + this.animalName;
	}
}

class Phone	{
	private String phoneName;

	Phone(String name)	{
		this.phoneName = name;
	}

	@Override
	public String toString()	{
		return "Phone: " + this.phoneName;
	}
}
