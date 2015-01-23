package frontend;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileRead {

	static FileRead instance;
	BufferedReader reader;
	
	
	public FileRead(String fileName) 
	{
		try
		{
			FileReader inputFile = new FileReader(fileName);
			this.reader=new BufferedReader(inputFile);
		}
		catch (FileNotFoundException e)
		{
			this.reader=null;
			this.Error("FILE NOT AVAILABLE");
		}
		
	}
	
	public char getSym()
	{
		char retun= 0x00;
		try {
			int read=this.reader.read();
			if(read == -1)
			{
				retun = 0xff;
			}
			else
			{
				retun= (char)read;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			this.Error(e.getMessage());
		}
		
		return retun;
	}
	void Error(String Err)
	{
		System.out.println(Err);
	}
}
