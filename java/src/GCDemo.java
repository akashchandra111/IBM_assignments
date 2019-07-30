class GCDemo	{
	public static void main(String... args)	{
		Runtime rt = Runtime.getRuntime();

		System.out.println("Total Memory Available: " + ((rt.totalMemory())/1024)/1024 + "MB");
		System.out.println("Free Memory Available: " + ((rt.freeMemory())/1024)/1024 + "MB");

		for(int i=0; i<10000; ++i)	{
			new java.util.Scanner(System.in);
		}

		System.out.println("Free Memory Available (after loop): " + ((rt.freeMemory())/1024)/1024 + "MB");

		//Request the jvm runtime to run garbage collector
		//might or mightn't run
		rt.gc();

		System.out.println("Free Memory Available (after requesting to gc): " + ((rt.freeMemory())/1024)/1024 + "MB");
	}
}
