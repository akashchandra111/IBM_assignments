import java.lang.Thread;
import com.copythread.CopyDataThread;

public class FileProgram	{
	public static void main(String[] args) {
		Thread threadToRun = new Thread(new CopyDataThread("source.txt", "target.txt"));

		threadToRun.start();
	}
}
