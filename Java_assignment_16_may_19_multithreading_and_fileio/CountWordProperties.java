import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class CountWordProperties	{
	public static void main(String... args)	{

		int countChars=0, countNewLines=0, countWords=0;
		try(BufferedReader bReader = new BufferedReader(new FileReader(new File("readthisfile.txt"))))	{
			int c=0;
			boolean prevWasSpace = false;
			while((c = bReader.read()) != -1)	{
				if((char)c == ' ' && prevWasSpace == false)	{
					++countWords;
					prevWasSpace = true;
				}
				else if((char)c == '\n')	{
					++countNewLines;
					++countWords;
					if((char)c == '\n' && prevWasSpace == true)	prevWasSpace = false;
					else	prevWasSpace = true;
				}
				else	{
					prevWasSpace = false;
				}

				++countChars;
			}
			//countWords += countNewLines;
		}
		catch(IOException io)	{
			System.out.println(io);
		}

		System.out.println("Total Characters: " + countChars + " Total Words: " + countWords +" Total New Lines: " + countNewLines);
	}
}
