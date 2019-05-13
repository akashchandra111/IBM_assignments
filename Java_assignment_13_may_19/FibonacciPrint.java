class FibonacciPrint	{
	public static void main(String... args)	{
		FibonacciPrint.fib1(89);
		System.out.println();
		FibonacciPrint.fib2(89);
	}

	public static void fib1(int num)	{
		int temp, firstNum=1, secondNum=1;
		System.out.print("1 1 ");
		while(secondNum < num)	{
			temp = firstNum;
			firstNum = secondNum;
			secondNum = temp + firstNum;
			System.out.print(secondNum + " ");
		}
	}

	static int firstNum=1, secondNum=1;
	public static void fib2(int num)	{
		int temp;
		if (FibonacciPrint.firstNum == FibonacciPrint.secondNum) System.out.print("1 1 ");
		if(num > FibonacciPrint.secondNum)	{
			temp = FibonacciPrint.firstNum;
			FibonacciPrint.firstNum = FibonacciPrint.secondNum;
			FibonacciPrint.secondNum = FibonacciPrint.firstNum + temp;
			System.out.print(FibonacciPrint.secondNum + " ");
			fib2(num);
		}
	}
}
