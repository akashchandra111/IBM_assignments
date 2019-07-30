import java.util.Scanner;

class Calculator	{
	public static void main(String... args)	{

	//Old logic
	// 	if (args.length != 3)	{
	// 		System.out.println("Usage:\n\t java Calculator operation operand1 operand2");
	// 		System.out.println("\t Operations possible: add sub mul div");
	// 	}
	// 	else	{
	// 		float operand1 = Float.parseFloat(args[1]);
	// 		float operand2 = Float.parseFloat(args[2]);
	//
	// 		System.out.println("Result of operation is: " + Calculator.calculate(args[0], operand1, operand2));
	// 	}

	System.out.println("Result is: " +
	calculate(takeInput("Enter operator: "), Float.parseFloat(takeInput("Enter operand 1: ")), Float.parseFloat(takeInput("Enter operand 2: ")))
	);

	}

	//Function to take on input from user
	public static String takeInput(String ques)	{
		System.out.print(ques);
		return (new Scanner(System.in).nextLine());
	}

	//Function to calculate the mathematics expression
	public static float calculate(String operation, float operand1, float operand2)	{
		if(operation.equalsIgnoreCase("add"))	{
			return operand1 + operand2;
		}
		else if(operation.equalsIgnoreCase("sub"))	{
			return operand1 - operand2;
		}
		else if(operation.equalsIgnoreCase("mul"))	{
			return operand1 * operand2;
		}
		else if(operation.equalsIgnoreCase("div"))	{
			return operand1 / operand2;
		}
		else if(operation.equalsIgnoreCase("mod"))	{
			return operand1 % operand2;
		}
		else	{
			return 0;
		}
	}
}
