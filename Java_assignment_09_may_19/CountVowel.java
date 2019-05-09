import java.util.Scanner;

class CountVowel	{
	public static void main(String... args)	{
		System.out.print("Enter string: ");
		String strToCheck = new Scanner(System.in).nextLine();
		byte counterA=0, counterE=0, counterI=0, counterO=0, counterU=0;
		for(int i=0; i<strToCheck.length(); ++i)	{
			switch(strToCheck.charAt(i))	{
				case 'A':
				case 'a':
					++counterA;
					break;
				case 'E':
				case 'e':
					++counterE;
					break;
				case 'I':
				case 'i':
					++counterI;
					break;
				case 'O':
				case 'o':
					++counterO;
					break;
				case 'U':
				case 'u':
					++counterU;
					break;
				default:
					break;
			}
		}

		System.out.println("A occured: " + counterA + " time/s");
		System.out.println("E occured: " + counterE + " time/s");
		System.out.println("I occured: " + counterI + " time/s");
		System.out.println("O occured: " + counterO + " time/s");
		System.out.println("U occured: " + counterU + " time/s");
	}
}
