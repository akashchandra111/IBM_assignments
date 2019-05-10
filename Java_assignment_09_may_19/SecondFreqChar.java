import java.util.Scanner;
import java.util.Arrays;

class SecondFreqChar	{
	public static void main(String... args)	{
		System.out.print("Enter string to find second frequent character: ");
		String checkInThis = new Scanner(System.in).nextLine();

		char[] charArray = checkInThis.toCharArray();
		Arrays.sort(charArray);

		char mostFreqChar=' ', secondMostFreqChar=' ', curChar=' ';
		int mostFreqCharCount=0, secondMostFreqCharCount=0, curCharCount=0;

		curChar = charArray[0];

		for(int i=0; i<charArray.length; ++i)	{
			if(curChar == charArray[i])	{
				++curCharCount;
				System.out.println("Same char encountered!");
			}
			else	{
				curCharCount = 0;
				System.out.println("Different character encountered!");

				if(curCharCount > mostFreqCharCount)	{
					secondMostFreqCharCount = mostFreqCharCount;
					mostFreqCharCount = curCharCount;

					secondMostFreqChar = mostFreqChar;
					mostFreqChar = curChar;

					System.out.println("New most occured character found!");
				}
				curChar = charArray[i];
			}
			System.out.println("mfc: " + mostFreqChar + " smfc: " + secondMostFreqChar + " cc: " + curChar);
		}

		System.out.println("Second Frequent character: " + secondMostFreqChar + " occured: " + secondMostFreqCharCount + " times");
	}
}
