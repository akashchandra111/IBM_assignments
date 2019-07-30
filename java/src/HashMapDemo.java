import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Unsorted
class HashMapDemo	{
	public static void main(String... args)	{
		HashMap hMap = new HashMap();

		hMap.put("Akash", 1234);
		hMap.put("Chandra", 5678);
		hMap.put("sky", new Double(1234.0));

		Set set = hMap.entrySet();

		for(Object obj: set)	{
			Map.Entry mapEntry = (Map.Entry)obj;
			System.out.println("Key: " + mapEntry.getKey() + " Value: " + mapEntry.getValue());
		}

		System.out.println("hMap.get('Akash'): " + hMap.get("Akash"));
		hMap.put("Akash", (int)(Integer)hMap.get("Akash")*2);
		System.out.println("hMap.put('Akash', hm.get('Akash')*2): " + hMap.get("Akash"));
	}
}
