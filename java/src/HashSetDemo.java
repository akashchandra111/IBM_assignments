import java.util.HashSet;

class HashSetDemo	{
	public static void main(String... args)	{
		HashSet hSet = new HashSet();

		hSet.add(100);
		hSet.add(200);
		hSet.add(150);
		hSet.add(200);
		hSet.add(150);

		System.out.println("HashSet: " + hSet);
	}
}
