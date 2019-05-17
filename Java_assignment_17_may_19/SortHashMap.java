import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Collections;
import java.util.Iterator;

class SortHashMap	{
	public static void main(String[] args) {
		HashMap hMap = new HashMap();

		hMap.put("Akash", 1234);
		hMap.put("Dheeraj", 12344);
		hMap.put("Shivam", 31234);
		hMap.put("Hussham", 14234);
		hMap.put("Venkatesh", 12364);
		hMap.put("Arvind", 132364);

		List aList = SortHashMap.getValues(hMap);
		Iterator iter = aList.iterator();
		while (iter.hasNext())	System.out.println("value: " + iter.next());
	}

	public static List getValues(HashMap hMap)	{
		Set set = hMap.entrySet();
		ArrayList list = new ArrayList();

		for(Object obj: set)	{
			Map.Entry mapEntry = (Map.Entry)obj;
			list.add(mapEntry.getValue());
		}

		Collections.sort(list);
		return list;
	}
}
