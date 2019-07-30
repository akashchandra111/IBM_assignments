import java.io.File;
import java.io.IOException;

class FileCreatorDemo	{
	public static void main(String[] args) {
		File addFile = new File("../classes", "newtextfile.txt");
		try	{
			System.out.println(addFile.createNewFile());
			System.out.println(addFile.mkdir());	//Wouldn't add any new folder there might be some mistake with folder
		}
		catch(IOException io)	{
			System.out.println(io);
		}
	}
}
