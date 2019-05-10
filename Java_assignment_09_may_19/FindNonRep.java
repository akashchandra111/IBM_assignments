import java.util.Scanner;
import java.util.Arrays;

class FindNonRep	{
	public static void main(String... args)	{
		System.out.print("Enter string: ");
		String findInIt = new Scanner(System.in).nextLine();

		String[] arrStrings = findInIt.split(" ");
		Arrays.sort(arrStrings);

		//for(String s: arrStrings)	System.out.println(s);

		int counter = 0;
		for(int i=0; i+1<arrStrings.length; ++i)	{
			//System.out.print("[for]");
			//System.out.println(arrStrings[i]);
			if(/*(i+1 < arrStrings.length) &&*/ (arrStrings[i].equals(arrStrings[i+1])))	{
				//System.out.print("[if]");
				int j=i+1;
				while(j<arrStrings.length && arrStrings[i].equals(arrStrings[j]))	{
					arrStrings[j] = " ";
					++j;
				}
				arrStrings[i] = " ";
			}
		}

		for(String s: arrStrings)	{
			if(s.equals(" "))	continue;
			else	{
				System.out.print(s + " ");
			}
		}
	}
}
