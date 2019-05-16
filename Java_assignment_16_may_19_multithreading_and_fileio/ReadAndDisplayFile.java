import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class ReadAndDisplayFile	{
	public static void main(String[] args) {
		try(BufferedReader bReader = new BufferedReader(new FileReader(new File("readthisfile.txt"))))	{
			int counter = 0;
			String str;
			while((str = bReader.readLine()) != null)	{
				++counter;
				System.out.println(counter + ": " + str);
			}
		}
		catch(IOException io)	{
			System.out.println("File Ended!");
		}
	}
}
