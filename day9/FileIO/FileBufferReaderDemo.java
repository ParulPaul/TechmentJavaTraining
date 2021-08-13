package com.day9.FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileBufferReaderDemo {

	public static void main(String[] args) throws IOException {
		
		
		FileReader fr=new FileReader("file.txt");
		  
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine(); //reading a line of text.
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
		}


	
	

}
