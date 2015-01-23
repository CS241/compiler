package tests;

import java.io.FileNotFoundException;

import frontend.FileRead;

public class FileReadTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String fileName="cases/test002.txt";

		FileRead fileRead=new FileRead(fileName);
		
		String file = "";
		char c;
		while((c=fileRead.getSym()) != 0xff)
		{
			file += c;

		}
		System.out.print(file);
	}

	

}
