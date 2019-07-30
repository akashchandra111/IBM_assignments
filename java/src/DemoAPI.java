import java.util.ArrayList;

public class DemoAPI	{
	public static void main(String... args)	{
		ArrayList laptops = new ArrayList();

		laptops.add(new Laptop(2, 200, "lenovo"));
		laptops.add(new Laptop(4, 250, "hp"));
		laptops.add(new Laptop(12, 2048, "AlienWare"));

		for(Object o: laptops)	{
			System.out.println(o);
		}
	}
}

class Laptop	{
	private Integer ramSize, hddSize;
	private String brandName;

	public Laptop(int ramSize, int hddSize, String brandName)	{
		this.ramSize = ramSize;
		this.hddSize = hddSize;
		this.brandName = brandName;
	}

	public Integer getRamSize()	{
		return this.ramSize;
	}

	public Integer getHddSize()	{
		return this.hddSize;
	}

	public String getBrandName()	{
		return this.brandName;
	}

	public String toString()	{
		return "this " + this.brandName + " laptop has " + this.ramSize + "gb of ram and " + this.hddSize + "gb of hard drive storage";
	}
}
