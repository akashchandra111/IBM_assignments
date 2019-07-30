import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class BufferedReaderDemo	{
	public static void main(String[] args) {
		try(BufferedReader fReader= new BufferedReader(new FileReader(new File("newfiletotest.txt")))) 	{
			System.out.println(fReader.readLine());
		}
		catch(IOException io)	{
			System.out.println(io);
		}
	}
}
