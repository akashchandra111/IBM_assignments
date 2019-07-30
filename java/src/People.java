public class People	{
	private String name;
	private Integer age;

	public People(String name, Integer age)	{
		this.name = name;
		this.age = age;
	}

	public String getName()	{
		return this.name;
	}

	public Integer getAge()	{
		return this.age;
	}

	@Override
	public String toString()	{
		return "Name: " + this.name + " Age: " + this.age.toString();
	}
}
