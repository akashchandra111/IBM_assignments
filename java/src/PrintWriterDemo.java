import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

class PrintWriterDemo	{
	public static void main(String[] args) {
		try(PrintWriter pWriter = new PrintWriter("../classes/printwriter.txt"))	{
			//pWriter.write(['a','k','a','s','h','\0']);
		}
		catch(IOException io)	{
			System.out.println(io)
		}
	}
}
