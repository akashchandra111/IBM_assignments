import java.util.Scanner;
import java.util.Arrays;

class SecondFreqChar	{
	public static void main(String... args)	{
		System.out.print("Enter string to find second frequent character: ");
		String checkInThis = new Scanner(System.in).nextLine();

		char[] charArray = checkInThis.toCharArray();
		Arrays.sort(charArray);

		//Find distinct characters
		int distinctChars = 0;
		for(int i=0; i<charArray.length; ++i)	{
			if(i+1<charArray.length && charArray[i]==charArray[i+1])	continue;
			else ++distinctChars;
		}

		//for(char c: charArray)	System.out.print(c);
		//System.out.println();
		//System.out.println(distinctChars);

		//Create array to contain count of distinct characters
		byte[] distinctCharsCount = new byte[distinctChars];

		//Count the occurance of each distinct characters
		for(int i=0, j=0; i<charArray.length; ++i)	{
			if(i+1<charArray.length && charArray[i]==charArray[i+1])	++distinctCharsCount[j];
			else {
				++distinctCharsCount[j++];
			}
		}

		//Check the counts
		//for(byte b: distinctCharsCount)	System.out.print(b + " ");
		//System.out.println();

		//Find second most character count
		int mostFreq=0, secondMostFreq=0;
		for(int i=0; i<distinctCharsCount.length; ++i)	{
			if(mostFreq < distinctCharsCount[i])	{
				secondMostFreq = mostFreq;
				mostFreq = distinctCharsCount[i];
			}
			else if(secondMostFreq < distinctCharsCount[i] && distinctCharsCount[i] < mostFreq)	{
				secondMostFreq = distinctCharsCount[i];
			}
		}

		//System.out.println("mostFreqCharCount: " + mostFreq);
		//System.out.println("secondMostFreqCharCount: " + secondMostFreq);

		//Print secondMostFreq characters
		int tempCounter = 0;
		for(int i=0; i<distinctCharsCount.length; ++i)	{
			if(distinctCharsCount[i] != secondMostFreq)	{
				tempCounter += distinctCharsCount[i];
				//System.out.println("tempCounter: " + tempCounter);
			}
			else	{
				break;
			}
		}

		System.out.println("secondMostFreqChar: " + charArray[tempCounter]);
	}

}
