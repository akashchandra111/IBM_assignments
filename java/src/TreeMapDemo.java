import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


//Sorted
public class TreeMapDemo	{
	public static void main(String... args)	{
		TreeMap tMap = new TreeMap();

		tMap.put("Akash", 1234);
		tMap.put("Chandra", 5678);
		tMap.put("sky", new Double(1234.0));

		Set set = tMap.entrySet();

		for(Object obj: set)	{
			Map.Entry mapEntry = (Map.Entry)obj;
			System.out.println("Key: " + mapEntry.getKey() + " Value: " + mapEntry.getValue());
		}

		System.out.println("tMap.get('Akash'): " + tMap.get("Akash"));
		tMap.put("Akash", (int)(Integer)tMap.get("Akash")*2);
		System.out.println("tMap.put('Akash', tMap.get('Akash')*2): " + tMap.get("Akash"));
	}
}
