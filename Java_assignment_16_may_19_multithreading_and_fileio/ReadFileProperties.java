import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

class ReadFileProperties	{
	public static void main(String[] args) {
		System.out.print("Enter file name: ");
		String fileName = new Scanner(System.in).nextLine();

//		try	{
			File file = new File(fileName);
			if (file.exists())	{
				System.out.println(fileName + " file is present! extension is: " + fileName.substring(fileName.indexOf('.')+1));
				System.out.println(fileName + " is " + file.length() + "bytes long");
			}
			else	{
				System.out.println(fileName + " file is not present!");
				System.out.println(fileName + " is not present, hence 0 length");
			}

			if (file.canRead())	System.out.println(fileName + " can read.");
			else	System.out.println(fileName + " is not allowed to read.");

			if (file.canWrite())	System.out.println(fileName + " can write.");
			else	System.out.println(fileName + "is not allowed to write.");
//`		}
//		catch(IOException io)	{
//			System.out.println(io);
//		}
	}
}
