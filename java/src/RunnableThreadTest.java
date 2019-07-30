class RunnableThreadTest	{
	public static void main(String... args)	{
		Thread myThread1 = new Thread(new Runnable()	{
			@Override
			public void run()	{
				System.out.println(Thread.currentThread().getName() + " running!");
			}
		});

		Thread myThread2 = new Thread(()->	{
			System.out.println(Thread.currentThread().getName() + " running!");
		});

		myThread1.start();
		myThread2.start();
	}
}

//	class TestRunnable implements Runnable	{
//		@Override
//		public void run()	{
//			System.out.println(Thread.currentThread().getName() + " running!");
//		}
//	}
