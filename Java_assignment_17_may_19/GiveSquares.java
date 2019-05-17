import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

class GiveSquares	{
	public static void main(String... args)	{
		Integer[] intArr = {90, 88, 70, 23, 45, 65, 43, 64, 76, 12};

		HashMap<Integer, Integer> hMap = GiveSquares.getSquares(intArr);
		Set set = hMap.entrySet();

		for(Object obj: set)	{
			Map.Entry mapEntry = (Map.Entry)obj;
			System.out.println(mapEntry.getKey() + ": " + mapEntry.getValue());
		}
	}

	public static HashMap getSquares(Integer[] intArr)	{
		HashMap<Integer, Integer> hMap = new HashMap<>();

		for(Integer i: intArr)	hMap.put(i, i*i);
		return hMap;
	}
}
