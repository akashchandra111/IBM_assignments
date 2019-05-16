import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

class ReplaceText	{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter word to replace: ");
		String replaceThis = scan.nextLine();

		System.out.print("Enter word to replace with: ");
		String replaceWith = scan.nextLine();

		try	{
			BufferedReader bReader = new BufferedReader(new FileReader(new File("readthisfile.txt")));
			String str = "";
			String replacedLine;
			while((replacedLine = bReader.readLine()) != null)	{
				replacedLine = replacedLine.replaceAll(replaceThis, replaceWith);
				System.out.println(replacedLine);
				str += replacedLine + "\n";
			}

			bReader.close();

			BufferedWriter bWriter = new BufferedWriter(new FileWriter(new File("readthisfile.txt")));

			//System.out.println(str);

			bWriter.write(str);
			bWriter.flush();
			bWriter.close();

			System.out.println("Content Replaced!");
		}
		catch(IOException io)	{
			System.out.println(io);
		}
	}
}
