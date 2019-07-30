import java.util.ArrayList;
import java.util.Iterator;

class ArrayListCollections	{
	public static void main(String... args)	{
		ArrayList aList = new ArrayList();

		//adding elements
		aList.add(100);
		aList.add(300);
		aList.add(150);
		aList.add(300);
		aList.add("Akash");
		aList.add(true);

		for(Object i: aList)	{
			System.out.println(i);
		}

		for(int i=0; i<aList.size(); ++i)	{
			System.out.println("Value: " + aList.get(i));
		}

		Iterator iter = aList.iterator();
		while (iter.hasNext())	System.out.println("Iterator: " + iter.next());


//		for(Object ob: list.iterator())	{
//			System.out.println("[for each]: " + ob);
//		}

		aList.remove(2);
		aList.remove(new Integer(300));

		for(Object o: aList)	{
			System.out.println("Values: " + o);
		}
	}
}
