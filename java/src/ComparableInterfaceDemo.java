import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class ComparableInterfaceDemo	{
	public static void main(String... args)	{
		List list = new ArrayList();

		list.add(new MobilePhone("Apple", 14000));
		list.add(new MobilePhone("Mango", 15500));
		list.add(new MobilePhone("Santra", 10990));
		list.add(new MobilePhone("Nariyal", 19990));

		Collections.sort(list);

		Iterator iter = list.iterator();
		while(iter.hasNext())	{
			System.out.println(iter.next());
		}
	}
}

class MobilePhone implements Comparable	{
	private String brandName;
	private int cost;

	public MobilePhone(String brandName, int cost)	{
		this.brandName = brandName;
		this.cost = cost;
	}

	//Sorting by brandName
	@Override
	public int compareTo(Object compareWith)	{
		return this.brandName.compareTo(((MobilePhone)compareWith).brandName);
	}

	@Override
	public String toString()	{
		return "Mobile brandName: " + this.brandName + " cost: " + this.cost;
	}
}
