import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorInterfaceDemo	{
	public static void main(String... args)	{
		List mobilePhoneList = new ArrayList();

		mobilePhoneList.add(new MobilePhone("Apple", 14000));
		mobilePhoneList.add(new MobilePhone("Mango", 12000));
		mobilePhoneList.add(new MobilePhone("Santra", 19000));
		mobilePhoneList.add(new MobilePhone("Nariyal", 10000));
		mobilePhoneList.add(new MobilePhone("Nimbu", 1000));

		Collections.sort(mobilePhoneList, new SortBrand());
		Iterator iter = mobilePhoneList.iterator();
		while(iter.hasNext())	{
			System.out.println(iter.next());
		}

		Collections.sort(mobilePhoneList, new SortCostDesc());
		iter = mobilePhoneList.iterator();
		while(iter.hasNext())	{
			System.out.println(iter.next());
		}
	}
}

class MobilePhone	{
	private String brandName;
	private int cost;

	public MobilePhone(String brandName, int cost)	{
		this.brandName = brandName;
		this.cost = cost;
	}

	@Override
	public String toString()	{
		return "Mobile brand: " + this.brandName + " cost: " + this.cost;
	}

	public String getBrand()	{
		return this.brandName;
	}

	public Integer getCost()	{
		return this.cost;
	}
}

class SortBrand implements Comparator	{
	@Override
	public int compare(Object obj1, Object obj2)	{
		return ((MobilePhone)obj1).getBrand().compareTo(((MobilePhone)obj2).getBrand());
	}
}

class SortCostDesc implements Comparator	{
	@Override
	public int compare(Object obj1, Object obj2)	{
		return -(((MobilePhone)obj1).getCost().compareTo(((MobilePhone)obj2).getCost()));
	}
}
