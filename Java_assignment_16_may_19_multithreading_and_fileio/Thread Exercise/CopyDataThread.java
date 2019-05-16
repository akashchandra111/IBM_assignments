package com.copythread;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.lang.Runnable;;

public class CopyDataThread implements Runnable	{

	private String source, target;

	public CopyDataThread(String source, String target)	{
		this.source = source;
		this.target = target;
	}

	@Override
	public void run()	{
		try	{
			BufferedReader bR = new BufferedReader(new FileReader(new File(this.source)));
			BufferedWriter bW = new BufferedWriter(new FileWriter(new File(this.target), true));
			int counter=0;
			int character;
			String tenCharStr="";
			while((character = bR.read()) != -1)	{
				if (counter != 10)	{
					++counter;
					tenCharStr += ((Character)((char)character)).toString();
				}
				else	{
					counter = 1;
					System.out.println("10 characters copied! Going to sleep, Characters: [" + tenCharStr + "]");
					Thread.sleep(5000);

					bW.write(tenCharStr);
					tenCharStr = ((Character)((char)character)).toString();
				}
			}
			//Writing remaining character
			bW.write(tenCharStr);

			bR.close();
			bW.flush();
			bW.close();
		}
		catch(IOException | InterruptedException io)	{
			System.out.println(io);
		}
	}
}
