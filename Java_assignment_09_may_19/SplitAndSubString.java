import java.lang.StringBuffer;

class SplitAndSubString	{
	private String dupString;
	public SplitString(String dupString)	{
		this.dupString = dupString;
	}

//	public String[] mySplit(String subStr)	{
//		String[] subStrings;
//		StringBuffer currentStr = new StringBuffer("");
//		byte counter=0, startIndex;
//		for(int i=0; i<this.dupString.length(); ++i)	{
//			if(this.dupString.charAt(i) == subStr.charAt(0))	{
//				++counter;
//				//System.out.println(this.dupString.charAt(i));
//			}
//		}
//		subStrings = new String[counter+1];
//		//System.out.println("subStrings length: " + subStrings.length);
//
//		startIndex = 0;
//		counter = 0;
//		for(byte endIndex=0; endIndex<this.dupString.length(); ++endIndex)	{
//			if(this.dupString.charAt(endIndex) == subStr.charAt(0) || endIndex == this.dupString.charAt(endIndex)-1)	{
//				subStrings[counter++] = this.subString(startIndex, endIndex).toString();
//				// System.out.println("substring[counter-1]: " + subStrings[counter-1]);
//				// System.out.println("startIndex: " + startIndex);
//				// System.out.println("endIndex: " + endIndex);
//				// System.out.println("this.dupString.length(): " + this.dupString.length());
//				// System.out.println("counter: " + counter);
//				startIndex = (byte) (endIndex+1);
//			}
//		}
//		subStrings[counter] = this.subString(startIndex, this.dupString.length()).toString();
//		return subStrings;
//	}

	public String[] mySplit(String subStr)	{
		String[] stringsToReturn;
		String compareTo = new String(this.dupString);
		byte counter = 0;
		int startIndex = 0;
		int endIndex = 0;

		while(compareTo.indexOf(subStr) != -1)	{
			compareTo = compareTo.replaceFirst(subStr, "");
			++counter;
		}

		stringsToReturn = new String[counter+1];
		counter = 0;
		compareTo = this.dupString;

		while((endIndex = compareTo.indexOf(subStr)) != -1)	{
			stringsToReturn[counter++] = compareTo.substring(startIndex, endIndex);
			compareTo = compareTo.replaceFirst(subStr, "");
			startIndex = endIndex;
		}
		stringsToReturn[counter] = compareTo.substring(startIndex, compareTo.length());
		return stringsToReturn;
	}

	public String subString(int startIndex, int endIndex)	{
		StringBuffer newString = new StringBuffer("");
		for (int i=startIndex; i<endIndex; ++i)	{
			//System.out.println(this.dupString.charAt(i));
			newString.append(this.dupString.charAt(i));
		}
		return newString.toString();
	}

	public static void main(String... args)	{
		SplitAndSubString splitStr = new SplitAndSubString("hello jello tell him to not kill");
		System.out.println("Substring 1, 5: " + splitStr.subString(1, 5));
		// splitStr.mySplit(" ");
		for(String split: splitStr.mySplit("kill"))	{
			System.out.println(split);
		}
	}
}
