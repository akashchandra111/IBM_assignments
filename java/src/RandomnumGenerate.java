class RandomnumGenerate extends Thread	{
	public static void main(String... args) throws InterruptedException	{
		for(int i=0; i<30; ++i)	{
			System.out.print((System.currentTimeMillis()*System.currentTimeMillis())%10000 + " ");
			Thread.sleep(500);
		}
	}
}
