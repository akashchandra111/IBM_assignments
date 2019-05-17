import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class CountChar	{
	public static void main(String... args)	{
		System.out.print("Enter string: ");
		java.util.Scanner scan = new java.util.Scanner(System.in);

		HashMap<Character, Integer> hMap = CountChar.countChar(scan.nextLine().toCharArray());
		Set set = hMap.entrySet();

		for(Object obj: set)	{
			Map.Entry mapEntry = (Map.Entry)obj;
			System.out.println(mapEntry.getKey() + ": " + mapEntry.getValue());
		}
	}

	public static HashMap countChar(char[] charArr)	{
		HashMap<Character, Integer> hMap = new HashMap();
		for(int i=0; i<charArr.length; ++i)	{
			int valueUpdater;
			if(hMap.get(Character.valueOf(charArr[i])) == null)	{
				hMap.put(Character.valueOf(charArr[i]), 1);
			}
			else if((valueUpdater = hMap.get(Character.valueOf(charArr[i]))) > 0)	{
				hMap.put(Character.valueOf(charArr[i]), valueUpdater+1);
			}
		}
		return hMap;
	}
}
