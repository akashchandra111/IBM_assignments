class ThreadTest extends Thread	{
	public static void main(String... args)	{
		System.out.println("[main] Hello Thread!");
		System.out.println("[main] " + Thread.currentThread().getName() + " is running!");

		ThreadTest myThread = new ThreadTest();
		myThread.start();

		System.out.println("[main] Running after calling start method.");
	}

	@Override
	public void run()	{
		System.out.println("[Thread-0] " + Thread.currentThread().getName() + " is running!");
	}
}
