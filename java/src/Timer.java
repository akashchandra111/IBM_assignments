class Timer extends Thread	{
	public static void main(String... args) /*throws InterruptedException*/{
		for(int i=0; i<20; ++i)	{
			System.out.printf("\r%d", i);
			try	{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)	{
				System.out.println("never occurs! generally");
			}
		}
	}
}
