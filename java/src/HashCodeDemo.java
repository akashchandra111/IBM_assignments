import java.util.HashMap;

class HashCodeDemo	{
	public static void main(String... args)	{
		HashMap hMap = new HashMap();

		hMap.put(new Employee("Akash", 47806), "FSD Guy");
		hMap.put(new Employee("Akash", 57005), "FSD Guy");
		hMap.put(new Employee("Dheeraj", 57007), "FSD Guy");
		hMap.put(new Employee("Akash", 49374), "R&D Guy");
		hMap.put(new Employee("Akash", 47806), "FSD Guy");

		for(Object obj: hMap.keySet())	{
			System.out.print((Employee)obj + " ");
			System.out.println(((Employee)obj).getEmp());
		}
	}
}

class Employee	{
	private String name;
	private Integer id;

	public Employee(String name, Integer id)	{
		this.name = name;
		this.id = id;
	}

	@Override
	public boolean equals(Object obj)	{
		Employee emp = (Employee)obj;
		return this.name.equals(emp.name) && this.id.equals(emp.id);
	}

	@Override
	public int hashCode()	{
		return this.id;
	}

	public String getEmp()	{
		return this.name + " " + this.id;
	}
}
