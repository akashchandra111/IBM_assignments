import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

class BufferedWriterDemo	{
	public static void main(String[] args) {
		try(BufferedWriter bW = new BufferedWriter(new FileWriter(new File("../classes", "newfiletotest.txt"), true)))	{
			bW.write("hello this is a new line.\n");
			bW.write("another new line");
			bW.newLine();
			bW.flush();
		}
		catch(IOException io)	{
			System.out.println(io);
		}
	}
}
