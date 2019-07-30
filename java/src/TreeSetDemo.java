import java.util.TreeSet;

class TreeSetDemo	{
		public static void main(String... args)	{
			//TreeSet can take only single type of objects
			TreeSet tSet = new TreeSet();

			tSet.add(8989);
			tSet.add(7676);
			//Error tSet.add("string");
			tSet.add(8998);
			tSet.add(8989);

			for(Object o: tSet)	{
				System.out.println(o);
			}

			//Adding 10 elements to TreeSet
			for(int i=0; i<10; ++i)	tSet.add(i);

			//Finding the subset of TreeSet
			for(Object obj: tSet.subSet(5, 8999))	System.out.println("Subset: " + (obj));
		}
}
